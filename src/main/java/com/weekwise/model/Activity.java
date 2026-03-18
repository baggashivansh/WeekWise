package com.weekwise.model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "activities")
public class Activity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private int duration;
    private LocalDate date;

    public Activity() {}

    public Activity(String name, int duration, LocalDate date) {
        this.name = name;
        this.duration = duration;
        this.date = date;
    }

    public Long getId() { return id; }

    public String getName() { return name; }

    public int getDuration() { return duration; }

    public LocalDate getDate() { return date; }

    public void setName(String name) { this.name = name; }

    public void setDuration(int duration) { this.duration = duration; }

    public void setDate(LocalDate date) { this.date = date; }
}