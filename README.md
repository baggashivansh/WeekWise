# WeekWise

A personal productivity tracking system built with **Java, Spring Boot, and a lightweight frontend**.

👉 Live: https://weekwise.netlify.app

WeekWise helps users track how they spend their time on a daily basis and understand productivity patterns through simple data driven insights.

Many people track productivity mentally or through scattered notes. WeekWise demonstrates how a structured backend system can store activity data and convert it into meaningful insights such as daily and weekly totals.

This project focuses on building a **backend driven system with a functional UI layer**, showing how data flows from user input to persistent storage and back to actionable insights.

---

# 🌐 Live Application

- 🖥 Frontend (Netlify): https://weekwise.netlify.app  
- ⚙ Backend (Render): https://weekwise-backend-2kad.onrender.com  

> Note: Backend may take 20–40 seconds to respond on first request due to cold start (free tier).

---

# What WeekWise Provides

WeekWise acts as a productivity tracking backend with a connected UI layer.

It provides:

* A structured API for recording daily activities
* A backend service for retrieving activity data
* A system for calculating productivity insights
* A lightweight frontend for interacting with the backend

The system allows users to log activities and immediately understand how their time is being spent.

---

# Key Features

* Create and store activity records
* Retrieve all activities
* Filter activities by date
* Delete activity entries

* View total time spent:
  * Today
  * This week

* REST based backend architecture
* Automatic database table creation using JPA
* Responsive UI with clean interaction flow

---

# Technology Stack

Backend  
Java  
Spring Boot  
Spring Data JPA  

Database  
H2 File Based Database  

Frontend  
HTML  
CSS  
Vanilla JavaScript  

Build Tool  
Maven  

Deployment  
Render (Backend)  
Netlify (Frontend)  

---

# System Architecture

WeekWise follows a layered architecture where each layer has a clear responsibility.

Controller Layer  
Handles incoming HTTP requests and exposes REST endpoints  

Service Layer  
Contains business logic including validation and time aggregation  

Repository Layer  
Handles database interaction using Spring Data JPA  

Database Layer  
Stores activity records in an H2 database  

Frontend Layer  
Provides a user interface to interact with backend APIs  

This separation keeps the system modular, maintainable, and scalable.

---

# How Activity Tracking Works in WeekWise

The system tracks productivity through structured activity logging.

1. A user logs an activity with name, duration, and date  
2. The request is sent to the backend API  
3. The controller forwards the request to the service layer  
4. The service layer processes and validates the data  
5. The repository layer stores the activity in the database  
6. The backend returns a structured response  
7. The frontend updates the UI and displays insights  

For insights:

* Daily total is calculated by summing durations for the current date  
* Weekly total is calculated over a rolling 7 day window  

This allows users to move from raw data to meaningful productivity patterns.

---

# Running the Project Locally

## Clone the repository

git clone https://github.com/your-username/weekwise.git  
cd weekwise  

---

## Build the project

mvn clean install  

---

## Run the application

mvn spring-boot:run  

Once started, access:  
http://localhost:8080  

---

# Accessing the Database

WeekWise uses an **H2 file based database** for persistence.

Access H2 console:  
http://localhost:8080/h2-console  

JDBC URL  
jdbc:h2:file:./data/weekwise-db  

Username  
sa  

Password  
leave empty  

---

# Example API Endpoints

Create Activity  
POST /api/activities  

Get All Activities  
GET /api/activities  

Get Activities By Date  
GET /api/activities/date/{date}  

Delete Activity  
DELETE /api/activities/{id}  

Get Today Total  
GET /api/activities/summary/today  

Get Weekly Total  
GET /api/activities/summary/week  

---

# Author

Built by Shivansh Bagga
