# Portfolio Website (Spring Boot + MongoDB + Static HTML/CSS)

## What is included
- Spring Boot backend (Java, Maven) that exposes `GET /api/resume` returning resume JSON stored in MongoDB.
- Simple static frontend (HTML/CSS/JS) served from `src/main/resources/static/index.html` which fetches and renders the resume.
- `docker-compose.yml` to quickly run a local MongoDB instance.
- Sample resume data is auto-seeded on application startup (if the DB is empty).

## Prerequisites
- Java 17 (JDK 17)
- Maven 3.6+
- Docker & docker-compose (optional, recommended for quick MongoDB startup) OR a running MongoDB instance

## Quick start (recommended using Docker)
1. Start MongoDB using docker-compose (from project root):
   ```bash
   docker-compose up -d
   ```
2. Build the project:
   ```bash
   mvn clean package -DskipTests
   ```
3. Run the jar:
   ```bash
   java -jar target/portfolio-0.0.1-SNAPSHOT.jar
   ```
4. Open your browser to `http://localhost:8080`

## Alternate: Use a local/remote MongoDB
- If you already have a MongoDB instance, edit `src/main/resources/application.properties` and update `spring.data.mongodb.uri` to point to your DB (for example: `mongodb+srv://<user>:<pass>@cluster0.mongodb.net/portfolio_db`)

## How data is seeded
- On first startup if the `resumes` collection is empty, the app saves a sample resume based on the provided resume image (name, contact, education, experience, projects, certifications, languages, expertise).

## Extending the project
- Add more endpoints (POST/PUT) in `ResumeController`.
- Replace static HTML with a SPA (React/Vue/Angular) if needed.
- Add authentication, templates, or PDF export.

---
If you want, I can:
- Add a Dockerfile to containerize the Spring Boot app.
- Replace the static frontend with a React app and include an API client.
- Add endpoints to manage the resume through a simple admin UI.
