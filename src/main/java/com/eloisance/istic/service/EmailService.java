package com.eloisance.istic.service;

import com.eloisance.istic.model.Activity;
import com.eloisance.istic.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import java.util.List;

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
     *
     */
    private void getWeather() {
        this.weatherService.getWeatherAt();
    }

    /**
     * @param u User to personalize template message
     * @return message
     */
    private String getMessageEmail(User u) {
        return "Bonjour " + u.getFirstname() + " " + u.getLastname() + "\n\n" +
        "D'après la météo et vos activités sélectionnées, pour ce weekend nous vous " +
        "conseillons de faire du vélo !";
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
            List<Activity> activities = u.getActivities();
            for (Activity a : activities) {
                a.getLevel().getSport().getName();
            }
            sendSimpleMessage(u.getEmail(), emailSubject, getMessageEmail(u));
        }
        System.out.println("All emails are send");
        sendReport(users.size());
    }
}
