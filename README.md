#  Banking Management System

##  Project Overview
The Banking Management System is a full-stack web application developed using **Spring Boot, Hibernate (JPA), and MySQL**.  
It allows users to securely log in and manage bank account details such as creating, updating, viewing, and deleting records.

---

##  Features
- User Login Authentication  
- Create Account  
- Modify Account  
- View Account Details  
- Delete with Confirmation  
- Sorting of records  

---

## Tech Stack
- Java (Core + OOP)  
- Spring Boot  
- Hibernate (JPA)  
- MySQL  
- HTML, CSS, Thymeleaf  

---

##  Setup Instructions

### 1. Create Database
Open MySQL and run:

```sql
CREATE DATABASE bank_db;
2. Configure Database

Open file:

src/main/resources/application.properties

Update:

spring.datasource.url=jdbc:mysql://localhost:3306/bank_db
spring.datasource.username=root
spring.datasource.password=yourpassword

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true

server.port=8080
3. Run Application

Run using IDE:

Run BankappApplication.java

OR using terminal:

mvn spring-boot:run
4. Access Application

Open browser:

http://localhost:8080
 Default Login Credentials
Username: admin  
Password: admin123

If not present, insert manually:

INSERT INTO users (username, password) VALUES ('admin', 'admin123');
 Project Structure
src/main/java/com/example/bankapp/
│
├── controller/
├── service/
├── repository/
├── entity/
└── BankappApplication.java

src/main/resources/
├── templates/
├── application.properties
└── data.sql


##  Screenshots

###  Login Page
![Login](Login%20Page.png)

###  Dashboard
![Dashboard](Dashboard.png)

###  Account Detail Page
![Account](Account%20Detail%20page.png)

###  Accounts View Page
![View](Accounts%20View%20Page.png)
