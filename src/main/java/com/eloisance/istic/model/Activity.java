package com.eloisance.istic.model;

import javax.persistence.*;

@Entity
public class Activity {

    private Long id;
    private User user;
    private Sport sport;
    private String level;

    public Activity() { }

    public Activity(User p, Sport s, String level) {
        setUser(p);
        setSport(s);
        setLevel(level);
    }

    @Id
    @GeneratedValue
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @ManyToOne
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @ManyToOne
    public Sport getSport() {
        return sport;
    }

    public void setSport(Sport sport) {
        this.sport = sport;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }
}
