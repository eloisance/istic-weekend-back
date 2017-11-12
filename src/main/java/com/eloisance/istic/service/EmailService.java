package com.eloisance.istic.service;

import com.eloisance.istic.model.Activity;
import com.eloisance.istic.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;

@Service
public class EmailService {

    private UserService userService;
    private WeatherService weatherService;
    private String emailSubject;

    @Autowired
    public JavaMailSender emailSender;

    public EmailService(UserService userService, WeatherService weatherService) {
        this.userService = userService;
        this.weatherService = weatherService;
        this.emailSubject = "Votre activité pour ce weekend";
    }

    /**
     * Select best activity from weather param
     * TODO: improve this method - replace random by real detection activity with weather
     */
    private String getActivityByWeather(List<Activity> activities, String weather) {
        if (activities.size() == 0) {
            return null;
        }
        Random random = new Random();
        Integer rand = random.nextInt(activities.size());
        return activities.get(rand).getLevel().getSport().getName();
    }

    /**
     * @param u User to personalize template message
     * @return message
     */
    private String getMessageEmail(User u, String weather, String activity) {
        return "Bonjour " + u.getFirstname() + " " + u.getLastname() + "\n\n" +
        "D'après la météo ("+weather+") et vos activités sélectionnées, pour ce weekend nous vous " +
        "conseillons l'activité suivante: " + activity;
    }

    /**
     * @param to email address
     * @param subject email subject
     * @param text email message
     */
    private void sendSimpleMessage(String to, String subject, String text) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo(to);
        message.setSubject(subject);
        message.setText(text);
        emailSender.send(message);
        System.out.println("Send email at: " + to);
    }

    /**
     * Report to admin
     */
    private void sendReport(int i) {
        String adminEmail = "emmanuel.loisance@gmail.com";
        String subject = "Weekend report";
        String message = "Application notified " + i + " users for this weekend.";
        sendSimpleMessage(adminEmail, subject, message);
    }

    /**
     * Send emails for all users
     */
    public void send() {
        System.out.println("Start send emails");
        List<User> users = userService.findAll();
        for (User u : users) {
            String weather = this.weatherService.getWeatherAt(u.getLat(), u.getLng());
            List<Activity> activities = u.getActivities();
            String activity = getActivityByWeather(activities, weather);
            if (weather != null && activity != null) {
                sendSimpleMessage(u.getEmail(), emailSubject, getMessageEmail(u, weather, activity));
            }
         }
        System.out.println("All emails are send");
        sendReport(users.size());
    }
}
