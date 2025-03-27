### 📚 Library Management System

### 🚀 Overview

This is a Library Management System built using Spring Boot and Thymeleaf. It allows users to manage books with features like listing books, adding new books, and preventing duplicate entries.

### 🛠️ Tech Stack

Spring Boot – Backend framework

Thymeleaf – For dynamic web pages

Jakarta Validation – Form validation

Spring MVC – Implements Model-View-Controller pattern

Render – Deployment platform

### 🎯 Features

📌 List all books

➕ Add a new book with validation

❌ Prevent duplicate book entries

🛠️ MVC-based architecture

## 📂 Project Structure

📦 src/main/java/com/library
 ┣ 📂controller        # Handles web requests
 ┣ 📂model             # Represents data structures
 ┣ 📂service           # Business logic
 ┣ 📂dao/exceptions    # Custom exceptions
📦 src/main/resources/templates/books
 ┣ 📜 list.html        # Book listing page
 ┣ 📜 add.html         # Add book page
📜 application.properties # Configurations
📜 Dockerfile          # Deployment file

## 🚀 How to Run Locally

## Clone the repository:

git clone https://github.com/your-username/library-management.git
cd library-management

## Run the application:

mvn spring-boot:run

## Access the app:
Open http://localhost:8080/books

🚢 Deployment on Render

Push your code to GitHub.

Connect the repo with Render.

Deploy using Dockerfile.
