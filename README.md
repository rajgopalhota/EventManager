# Virtual Event Management System

## Project Overview

The Virtual Event Management System is a comprehensive solution designed to facilitate the organization and management of virtual events. Built with modern technologies, this system enables seamless event scheduling, attendee management, interactive sessions, and detailed analytics. It provides a robust backend powered by Spring Boot and a dynamic frontend developed using React.js.

## Features

### Backend (Spring Boot)

- **Event Scheduling & Management:** RESTful APIs to manage events, sessions, speakers, and attendees. Includes endpoints for creating, updating, and deleting events, and fetching event details.
- **Attendee Registration & Management:** APIs for user registration, session booking, and attendee management. Includes services for generating and validating QR codes for attendance.
- **Content Delivery:** Integration with live streaming services, session recordings, and content sharing.
- **Venue Capacity & Allocation:** Management of virtual rooms, defining their capacity, and allocating attendees based on registration.
- **Payment Module:** Calculation of total prices, handling UPI transactions, and admin verification of payments.
- **Notifications & Emails:** Email and notification services for guest additions, event updates, and other notifications.
- **Analytics & Reporting:** Services to gather data such as attendance, engagement levels, and feedback, and generate detailed post-event reports.
- **Admin Dashboard:** Interface for managing event details, user roles, payments, and notifications.

### Frontend (React.js)

- **Event Listing & Details:** Pages for listing upcoming events, displaying details, and allowing registration or session joining.
- **Interactive Q&A & Polling:** Real-time Q&A sessions and polls within each session using WebSocket.
- **Networking Features:** Virtual lounges and chat rooms for attendee networking.
- **Venue & Session Management:** Interfaces to display room capacities and allocate attendees.
- **Attendance Tracking:** QR code scanning for session attendance.
- **Final Reports:** Downloadable detailed event reports.
- **Notification Panel:** Real-time notifications and updates.
- **Admin Interface:** Dashboard for admins to manage events, verify payments, and perform administrative tasks.
- **Payment Interface:** Checkout process for displaying costs and inputting UPI transaction numbers, with admin verification.

## Setup

### Project Versions

| Component   | Version           |
| ----------- | ----------------- |
| Spring Boot | 3.3.2             |
| Gradle      | 8.10              |
| Java        | 17                |
| React       | [Current Version] |
| Node.js     | v20.14.0          |

### Prerequisites

- Java 17 JDK
- Gradle 8.10
- Node.js v20.14.0
- MySQL Database

### Setup Instructions

#### Backend Setup

1. **Clone the Repository:**

   ```bash
   git clone https://github.com/rajgopalhota/EventManager.git
   cd EventManager
   ```

2. **Update `application.properties`:**
   Configure the database and JWT settings in the `src/main/resources/application.properties` file as follows:

   ```properties

   # Application Name
   spring.application.name=event-manager

   # Database Connection Configuration
   spring.datasource.url=jdbc:mysql://localhost:3306/event_manager
   spring.datasource.username=root
   spring.datasource.password=2003
   spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver

   # JPA & Hibernate Configuration
   spring.jpa.hibernate.ddl-auto=update
   spring.jpa.show-sql=true
   spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL8Dialect

   # JWT Secret Key
   jwt.secret=your-secret-key-here

   # JWT Expiration Time in milliseconds (e.g., 24 hours)
   jwt.expiration=86400000

   # Replace `your-secret-key-here` with a strong, randomly generated key for securing JWT tokens.

   ```

3. **Build and Run the Backend:**

   ```bash
   ./gradlew clean build
   ./gradlew bootRun
   ```

4. **Access the Backend:**
   Open your browser and navigate to `http://localhost:8080` to access the backend APIs.

#### Frontend Setup

1. **Navigate to the Frontend Directory:**

   ```bash
   cd client
   ```

2. **Install Dependencies:**

   ```bash
   npm install
   ```

3. **Run the Frontend Application:**

   ```bash
   npm start
   ```

4. **Access the Frontend:**
   Open your browser and navigate to `http://localhost:3000` to access the frontend application.

## Backend Dependencies

| Dependency                                 | Version |
| ------------------------------------------ | ------- |
| Spring Boot Starter Data JPA               | 3.3.2   |
| Spring Boot Starter Mail                   | 3.3.2   |
| Spring Boot Starter OAuth2 Client          | 3.3.2   |
| Spring Boot Starter OAuth2 Resource Server | 3.3.2   |
| Spring Boot Starter Security               | 3.3.2   |
| Spring Boot Starter Validation             | 3.3.2   |
| Spring Boot Starter Web                    | 3.3.2   |
| Spring Boot Starter WebSocket              | 3.3.2   |
| Spring Boot Admin Starter Server           | 3.3.2   |
| Lombok                                     | 1.18.26 |
| MySQL Connector/J                          | 8.0.32  |
| Spring Boot DevTools                       | 3.3.2   |
| Spring Boot Starter Test                   | 3.3.2   |
| Spring Security Test                       | 6.2.0   |
| JUnit Platform Launcher                    | 1.8.2   |

## Project Structure

- **Backend (`src/main/java/com/event`):** Contains Spring Boot application and related classes.
- **Frontend (`frontend/src`):** Contains React.js components and frontend logic.
- **Database (`src/main/resources`):** Configuration files and database schema.

## Contribution

Contributions are welcome! Please fork the repository and submit a pull request with your changes. Ensure that you follow the coding standards and include tests for new features or bug fixes.

## Contact

For any questions or issues, please contact [rajgopalhota@gmail.com](mailto:rajgopalhota@gmail.com) or visit [www.rajgopal.in](https://www.rajgopal.in)
