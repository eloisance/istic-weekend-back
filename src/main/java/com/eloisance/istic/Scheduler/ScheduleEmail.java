package com.eloisance.istic.Scheduler;

import com.eloisance.istic.service.EmailService;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ScheduleEmail {

    private final EmailService emailService;

    public ScheduleEmail(EmailService emailService) {
        this.emailService = emailService;
    }

    // debug with -> @Scheduled(cron = "*/2 * * * * *", zone = "Europe/Paris")
    @Scheduled(cron = "0 0 18 * * WED", zone = "Europe/Paris") // Mercredi à 18h
    public void notifyUsers() {
        System.out.println("ScheduleEmail -> notifyUsers()");
        emailService.send();
    }

}
