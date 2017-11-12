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

    @Scheduled(cron = "*/3 * * * * *", zone = "Europe/Paris")
    public void notifyUsers() {
        System.out.println("ScheduleEmail -> notifyUsers()");
        emailService.send();
    }

}
