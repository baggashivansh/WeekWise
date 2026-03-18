package com.weekwise.controller;

import com.weekwise.model.Activity;
import com.weekwise.service.ActivityService;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/api/activities")
@CrossOrigin("*")
public class ActivityController {

    private final ActivityService activityService;

    public ActivityController(ActivityService activityService) {
        this.activityService = activityService;
    }

    @PostMapping
    public Activity create(@RequestBody Activity activity) {
        return activityService.saveActivity(activity);
    }

    @GetMapping
    public List<Activity> getAll() {
        return activityService.getAllActivities();
    }

    @GetMapping("/date/{date}")
    public List<Activity> getByDate(@PathVariable String date) {
        return activityService.getByDate(LocalDate.parse(date));
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        activityService.deleteActivity(id);
    }

    // NEW: Today summary
    @GetMapping("/summary/today")
    public int getTodayTotal() {
        return activityService.getTodayTotal();
    }

    // NEW: Weekly summary
    @GetMapping("/summary/week")
    public int getWeeklyTotal() {
        return activityService.getWeeklyTotal();
    }
}