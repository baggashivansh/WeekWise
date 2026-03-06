# WeekWise

WeekWise is a minimal time visualization app that turns your lock screen into a quiet reminder of how time moves.

Instead of tracking time through numbers and dates, WeekWise shows time as simple grids. Each square represents a unit of time. As time passes, the grid fills. This creates a visual sense of progress that updates automatically.

The idea is simple: life moves forward one week at a time. Seeing that visually changes how people think about their time.

---

## Core Idea

WeekWise transforms time into visual grids.

Life becomes a grid of weeks.  
A year becomes a grid of weeks.  
A month becomes a grid of days.

Every time a new day or week passes, the wallpaper updates and fills the next square.

This creates a subtle but powerful reminder every time the user unlocks their phone or laptop.

---

## Features

### Life View

Visualize an entire lifetime in weeks.

- 90 years
- 52 weeks per year
- Approximately 4680 squares

Each square represents one week of life.

Filled squares show weeks already lived.

---

### Year View

Track the progress of the current year.

- 52 squares
- 1 square equals 1 week

As each week passes, the next square fills automatically.

This makes it easy to see how quickly the year is moving.

---

### Month View

Track progress through the current month.

- Each square represents one day
- Grid updates daily
- Helps users stay aware of daily progress

---

### Live Wallpaper

WeekWise runs as a live wallpaper that updates automatically.

The grid refreshes based on the current date so users always see the correct progress.

No manual updates required.

---

### Cross Device Support

WeekWise is designed to work across multiple devices.

- Android phones (live wallpaper)
- macOS laptops (auto updating desktop wallpaper)
- Web generator for downloadable wallpapers

---

## How It Works

The application calculates time progress using the current date.

Example logic:

```
weeksLived = (currentDate - birthDate) / 7
```

The app then renders a grid and fills squares based on progress.

This grid is drawn dynamically and displayed as the device wallpaper.

---

## Architecture

WeekWise uses a simple rendering engine to generate time grids.

```
current date
↓
calculate progress
↓
generate grid
↓
render wallpaper
```

The same logic powers all visualization modes.

---

## Tech Stack

Possible implementation stack:

Android
- Kotlin
- WallpaperService
- Canvas rendering

Web Generator
- HTML
- CSS
- JavaScript
- Canvas API

macOS Desktop
- Script based wallpaper updater

---

## Future Ideas

Possible improvements and features:

- Custom life expectancy settings
- Goal countdown grids
- Minimalist theme options
- Lock screen widgets
- iOS shortcut automation
- Yearly reflection insights

---

## Philosophy

WeekWise is built around a simple idea.

People rarely open productivity apps every day, but they look at their lock screen hundreds of times.

By turning time into a visual grid that lives on the wallpaper, WeekWise becomes a quiet reminder that time is always moving forward.

Not to create pressure, but awareness.

---

## License

This project is open for experimentation and personal use.

---

## Author

Built by Shivansh Bagga
