# 🧩 Freshdesk Data Mate

Freshdesk Data Mate is a **Spring Boot–based backend integration project** that securely connects with **Freshdesk APIs** to fetch, manage, and process ticket and user data.
This project is designed to be **reusable, configurable, and safe**, allowing each user to plug in **their own API credentials** from **Freshworks** without exposing secrets.

---

## 🚀 Features

* 🔐 Secure API integration with Freshdesk
* 📩 Fetch tickets, users, and related data
* ⚙️ Config-driven setup using `application.properties`
* ♻️ Reusable architecture for any Freshdesk account
* 🧪 Easy to extend for analytics, dashboards, or automation

---

## 🛠️ Tech Stack

* **Java**
* **Spring Boot**
* **REST APIs**
* **Jackson (JSON processing)**
* **Maven**

---

## 📂 Project Structure

```
freshdesk-data-mate/
├── src/main/java
│   └── com.example.freshdesk
│       ├── controller
│       ├── service
│       ├── config
│       └── dto
├── src/main/resources
│   └── application.properties
├── pom.xml
└── README.md
```

---

## 🔐 Important Configuration (MANDATORY)

⚠️ **DO NOT use hardcoded credentials**
Each user **must add their own Freshdesk API Key and Base URL** obtained from their Freshworks account.

---

## 🔑 How to Get Your Freshdesk API Key & URL

1. Log in to **Freshworks / Freshdesk Official Portal**
2. Click on your **Profile Picture**
3. Go to **Profile Settings**
4. Copy your **API Key**
5. Note your **Freshdesk domain URL**

Example:

```
https://yourcompany.freshdesk.com
```

---

## ⚙️ Configure `application.properties`

Replace the values below with **YOUR OWN credentials**:

```properties
server.port=8080

spring.application.name=FreshdeskDataMate

freshdesk.base.url=https://yourcompany.freshdesk.com/api/v2
freshdesk.api.key=YOUR_FRESHDESK_API_KEY

spring.jackson.serialization.indent_output=true
```

❗ Never commit your real API key to GitHub.

---

## ▶️ How to Run the Project

```bash
mvn clean install
mvn spring-boot:run
```

Application will start at:

```
http://localhost:8080
```

---

## 🧪 Sample Use Cases

* Fetch all Freshdesk tickets
* Monitor ticket status changes
* Build dashboards on top of Freshdesk data
* Automate reporting or alerts

---

## 🔒 Security Best Practices

* Add `application.properties` to `.gitignore`
* Use environment variables for production
* Rotate API keys periodically

---

## 📌 Notes

* This project **does not store Freshdesk credentials**
* Each user is responsible for their own API configuration
* Designed for learning, integration, and enterprise extension

---

## 📜 License

This project is for **educational and integration purposes**.
Freshdesk and Freshworks are trademarks of their respective owners.

---

## 🤝 Contributing

Feel free to fork, improve, and submit pull requests.
Clean commits and clear messages are appreciated ✨
