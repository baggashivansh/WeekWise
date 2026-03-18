package com.weekwise.repository;

import com.weekwise.model.Activity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface ActivityRepository extends JpaRepository<Activity, Long> {

    List<Activity> findByDate(LocalDate date);

    List<Activity> findByDateBetween(LocalDate start, LocalDate end);
}