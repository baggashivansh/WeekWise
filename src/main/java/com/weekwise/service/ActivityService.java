package com.weekwise.service;

import com.weekwise.model.Activity;
import com.weekwise.repository.ActivityRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class ActivityService {

    private final ActivityRepository activityRepository;

    public ActivityService(ActivityRepository activityRepository) {
        this.activityRepository = activityRepository;
    }

    public Activity saveActivity(Activity activity) {
        if (activity.getDuration() <= 0) {
            throw new RuntimeException("Duration must be positive");
        }
        return activityRepository.save(activity);
    }

    public List<Activity> getAllActivities() {
        return activityRepository.findAll();
    }

    public List<Activity> getByDate(LocalDate date) {
        return activityRepository.findByDate(date);
    }

    public void deleteActivity(Long id) {
        activityRepository.deleteById(id);
    }

    public int getTodayTotal() {
        List<Activity> activities = activityRepository.findByDate(LocalDate.now());
        return activities.stream().mapToInt(Activity::getDuration).sum();
    }

    public int getWeeklyTotal() {
        LocalDate today = LocalDate.now();
        LocalDate startOfWeek = today.minusDays(6);

        List<Activity> activities =
                activityRepository.findByDateBetween(startOfWeek, today);

        return activities.stream().mapToInt(Activity::getDuration).sum();
    }
}