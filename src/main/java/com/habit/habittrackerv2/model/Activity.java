package com.habit.habittrackerv2.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.Instant;

@Entity
public class Activity {

    @Id
    @GeneratedValue
    private Integer id;

    @ManyToOne
    private Habit habit;

    @CreationTimestamp
    private Instant createdAt;

    @UpdateTimestamp
    private Instant updatedAt;


    public void setHabit(Habit habit) {
        this.habit = habit;
    }
}
