package com.eloisance.istic;

import com.eloisance.istic.model.Activity;
import com.eloisance.istic.model.User;
import com.eloisance.istic.model.Place;
import com.eloisance.istic.model.Sport;
import com.eloisance.istic.service.ActivityService;
import com.eloisance.istic.service.PlaceService;
import com.eloisance.istic.service.SportService;
import com.eloisance.istic.service.UserService;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class App {

    private UserService userService;
    private SportService sportService;
    private PlaceService placeService;
    private ActivityService activityService;

    private App(EntityManager manager) {
        this.userService = new UserService(manager);
        this.sportService = new SportService(manager);
        this.placeService = new PlaceService(manager);
        this.activityService = new ActivityService(manager);
    }


    public static void main(String[] args) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("mysql");
        EntityManager manager = factory.createEntityManager();
        App app = new App(manager);

        EntityTransaction tx = manager.getTransaction();
        tx.begin();
        try {
            app.addPlaces();
            app.addSports();
            app.addPersons();
            app.addActivities();
        } catch (Exception e) {
            e.printStackTrace();
        }
        tx.commit();
        manager.close();

        System.out.println("... done");
    }

    /**
     * Add sports examples
     */
    private void addSports() {
        sportService.create(new Sport("Surf"));
        sportService.create(new Sport("Vélo"));
        sportService.create(new Sport("Running"));
    }

    /**
     * Add persons examples
     */
    private void addPersons() {
        User user = new User("Toto", "Titi", "toto@gmail.com", "0011223344");
        userService.create(user);
    }

    /**
     * Add places examples
     */
    private void addPlaces() {
        placeService.create(new Place("Saint malo"));
        placeService.create(new Place("Rennes"));
    }

    /**
     * Add activities examples
     */
    private void addActivities() {
        User u = userService.findById((long) 1);
        Sport s = sportService.findByName("Vélo");
        Activity act1 = new Activity(u, s, Levels.MEDIUM);
        activityService.create(act1);
    }
}