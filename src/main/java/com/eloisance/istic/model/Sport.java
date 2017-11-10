package com.eloisance.istic.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
public class Sport implements Serializable {

    private Long id;
    private String name;
    private String image;
    private List<Level> levels;

    public Sport() { }

    public Sport(String name, String image, List<Level> levels) {
        setName(name);
        setImage(image);
        setLevels(levels);
    }

    @Id
    @GeneratedValue
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

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @JsonIgnoreProperties(value = "sport")
    @OneToMany(mappedBy = "sport", fetch = FetchType.EAGER)
    public List<Level> getLevels() {
        return levels;
    }

    public void setLevels(List<Level> levels) {
        this.levels = levels;
    }
}
