# 🎓 Student Management System (Java + JDBC)

## 📌 Overview

A console-based **Student Management System** built using **Java and JDBC**, integrated with a **MySQL database**.
The application allows users to perform full **CRUD operations** (Create, Read, Update, Delete) on student records.

---

## 🚀 Features

* ➕ Add new student
* 📋 View all students
* ✏️ Update student details
* ❌ Delete student
* 🗄️ MySQL database integration
* 🔄 Menu-driven console interface

---

## 🛠️ Tech Stack

* **Language:** Java
* **Database:** MySQL
* **Connectivity:** JDBC
* **IDE:** VS Code

---

## 📂 Project Structure

```
StudentManagement/
│── src/
│   ├── App.java
│   ├── DBConnection.java
│   ├── Student.java
│   ├── StudentDAO.java
│
│── .gitignore
│── README.md
```

---

## ⚙️ Setup Instructions

### 1️⃣ Clone the Repository

```
git clone https://github.com/YOUR_USERNAME/Student-Management-System-Java-JDBC.git
cd Student-Management-System-Java-JDBC
```

---

### 2️⃣ Setup MySQL Database

Run the following SQL commands:

```sql
CREATE DATABASE student_db;

USE student_db;

CREATE TABLE students (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(50),
    age INT,
    course VARCHAR(50)
);
```

---

### 3️⃣ Configure Database Connection

Update your credentials in `DBConnection.java`:

```java
String url = "jdbc:mysql://localhost:3306/student_db";
String user = "root";
String password = "your_password";
```

---

### 4️⃣ Add MySQL Connector J

Download MySQL Connector J from:
https://dev.mysql.com/downloads/connector/j/

Place the `.jar` file inside a `lib` folder.

---

### 5️⃣ Compile and Run

```
javac -cp ".;lib/mysql-connector-j.jar" src/*.java
java -cp ".;lib/mysql-connector-j.jar;src" App
```

---

## 📸 Sample Output

```
==== Student Management System ====
1. Add Student
2. View Students
3. Update Student
4. Delete Student
5. Exit
```

---

## 💡 Key Concepts Used

* JDBC (Java Database Connectivity)
* DAO (Data Access Object) Pattern
* Object-Oriented Programming (OOP)
* Exception Handling
* SQL Queries

---

## 🔮 Future Enhancements

* GUI using JavaFX or Swing
* REST API using Spring Boot
* Authentication system
* Search and filter functionality

---

## 👨‍💻 Author

**Sampark Gupta**

---

## ⭐ If you like this project

Give it a ⭐ on GitHub!
