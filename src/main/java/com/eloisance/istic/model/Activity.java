package com.eloisance.istic.model;

import com.eloisance.istic.Levels;

import javax.persistence.*;

@Entity
public class Activity {

    private Long id;
    private User user;
    private Sport sport;
    private Enum<Levels> level;

    public Activity() { }

    public Activity(User p, Sport s, Enum<Levels> level) {
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

    public Enum<Levels> getLevel() {
        return level;
    }

    public void setLevel(Enum<Levels> level) {
        this.level = level;
    }
}
