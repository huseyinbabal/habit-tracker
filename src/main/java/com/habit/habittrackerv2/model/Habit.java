package com.habit.habittrackerv2.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import java.util.Set;

@Entity
public class Habit {

    @Id
    @GeneratedValue
    private Integer id;

    private String name;

    @OneToMany(mappedBy = "habit")
    private Set<Activity> activities;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
