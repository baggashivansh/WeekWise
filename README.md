# WeekWise

## A Visual Time Awareness Application

WeekWise is a minimal time visualization application that transforms the passage of time into a simple visual grid.

Instead of thinking about time through calendars, numbers, or dates, WeekWise represents time using small squares where each square represents a unit of time. As time passes, more squares are filled.

This creates a visual representation of how time moves forward.

The grid automatically updates based on the current date and can be displayed as a device wallpaper, turning the lock screen into a quiet reminder of time passing.

---

# Overview

Most productivity tools require users to actively open the application to track progress.

WeekWise takes a different approach.

People check their phones or computers hundreds of times a day. By displaying time progress directly on the wallpaper, the application creates passive awareness without requiring any manual interaction.

Instead of numbers and schedules, time becomes a simple visual pattern.

Example concepts used in WeekWise:

Life → represented as weeks
Year → represented as weeks
Month → represented as days

Each square represents a time unit, and filled squares represent time that has already passed.

---

# Core Idea

WeekWise visualizes time through grids.

Life becomes a grid of weeks.
A year becomes a grid of weeks.
A month becomes a grid of days.

Every time a day or week passes, the application fills the next square in the grid.

The result is a visual timeline that grows automatically over time.

This design encourages users to become more aware of how time progresses.

---

# Features

## Life View

Life View represents an entire lifetime in weeks.

Assuming a lifespan of 90 years:

90 years × 52 weeks = approximately 4680 weeks

Each square represents one week of life.

Squares that are already filled represent weeks that have already passed.

This creates a visual representation of life progression.

---

## Year View

Year View visualizes the progress of the current year.

52 squares represent the 52 weeks of a year.

Every week that passes fills the next square.

This makes it easy to understand how much of the year has already passed.

---

## Month View

Month View tracks the progress of the current month.

Each square represents one day.

The grid updates daily to reflect the current date.

This helps users maintain awareness of daily progress.

---

## Live Wallpaper

WeekWise can run as a live wallpaper that updates automatically.

The application recalculates the grid based on the current date and refreshes the wallpaper.

Because the update happens automatically, the visualization always reflects the correct time progression.

---

## Cross Device Support

WeekWise is designed to work across multiple platforms.

Supported platforms may include:

Android phones using live wallpaper services
macOS laptops using automated wallpaper updates
Web-based generators for downloadable wallpapers

This allows users to use the visualization across devices.

---

# How It Works

The core logic calculates time progression based on the current date.

Example logic:

weeksLived = (currentDate - birthDate) / 7

Once the number of weeks lived is calculated, the application generates a grid and fills the corresponding number of squares.

The grid is then rendered and displayed as a wallpaper.

Basic system flow:

current date
↓
calculate progress
↓
generate grid
↓
render visualization
↓
display wallpaper

The same logic is used for life view, year view, and month view.

---

# System Architecture

WeekWise uses a lightweight rendering pipeline.

Current Date
↓
Time Progress Calculator
↓
Grid Generator
↓
Renderer
↓
Wallpaper Output

This architecture allows the same core logic to power multiple visualization modes.

---

# Technology Stack

Possible implementation technologies include:

Android Application

Kotlin
WallpaperService
Canvas rendering

Web Generator

HTML
CSS
JavaScript
Canvas API

Desktop Implementation

Script based wallpaper updater for macOS

---

# Future Enhancements

Several features could extend the capabilities of WeekWise.

Custom life expectancy settings
Goal countdown grids
Minimalist theme options
Lock screen widgets
iOS shortcut automation
Yearly reflection insights

These improvements would make the application more flexible while keeping the core design minimal.

---

# Philosophy

WeekWise is built on a simple observation.

People rarely open productivity apps every day, but they unlock their devices many times daily.

By turning time into a visual grid displayed on the wallpaper, WeekWise quietly reminds users that time is always moving forward.

The goal is not to create pressure, but awareness.

---

# License

This project is open for experimentation and personal use.

---

# Author

Built by **Shivansh Bagga**
