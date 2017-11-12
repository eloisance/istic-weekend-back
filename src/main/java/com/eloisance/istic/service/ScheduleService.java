package com.eloisance.istic.service;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ScheduleService {

    @Scheduled(cron = "*/30 * * * * *", zone = "Europe/Paris")
    public void log() {
        System.out.println("enter");
    }

}
