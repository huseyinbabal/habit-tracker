package com.habit.habittrackerv2.repository;

import com.habit.habittrackerv2.model.Habit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HabitRepository extends JpaRepository<Habit, Integer> {}
