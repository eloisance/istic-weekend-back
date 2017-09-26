package com.eloisance.istic.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.List;

@Entity
public class Level {

    private Long id;
    private String name;
    private Sport sport;
    private int rank;
    private List<Activity> activities;

    public Level() { }

    public Level(String name, Sport sport, int rank) {
        setName(name);
        setSport(sport);
        setRank(rank);
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @ManyToOne
    @JsonIgnoreProperties(value = "levels")
    public Sport getSport() {
        return sport;
    }

    public void setSport(Sport sport) {
        this.sport = sport;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int order) {
        this.rank = order;
    }

    @OneToMany(mappedBy = "level", fetch = FetchType.EAGER)
    @JsonIgnoreProperties(value = "level")
    public List<Activity> getActivities() {
        return activities;
    }

    public void setActivities(List<Activity> activities) {
        this.activities = activities;
    }

}
