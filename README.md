# 🏥 Smart Prescription System

## 📌 Overview  
The **Smart Prescription System** is a Java-based healthcare application that enables pharmacists to manage medicines and helps patients find appropriate medications based on medical conditions. This system streamlines pharmacy operations and improves accessibility to medicines.

---

## 🚀 Features  
✅ **Pharmacist Management**: Register and log in as a pharmacist.  
✅ **Medicine Management**: Add, update, and retrieve medicines along with associated conditions.  
✅ **Patient Assistance**: Search for medicines based on medical conditions.  
✅ **Secure Database Operations**: Uses Hibernate and MySQL for seamless data management.  

---

## 🛠 Tech Stack  
- **Programming Language**: Java  
- **Frameworks & Libraries**: Hibernate, JDBC  
- **Database**: MySQL  
- **Tools**: Eclipse, MySQL Workbench, Maven  

---

## 📂 Project Structure  
```plaintext
/smart-prescription-system
│── src/main/java/
│   ├── smartPrescriptionModel/       # Entity classes (Medicine, Cause, Pharmacist)
│   ├── smartPrescriptionDao/         # DAO Layer (Database operations)
│   ├── smartPrescriptionService/     # Service Layer (Business logic)
│   ├── smartPrescriptionController/  # Controller Layer (User interaction)
│   ├── smartPrescriptionMain/        # Main application entry point
│── pom.xml                           # Maven dependencies
│── README.md                         # Project Documentation
```
This project is licensed under the MIT License.


⚙️ Setup Instructions
1️⃣ Clone the Repository
sh
Copy
Edit
```
git clone https://github.com/your-username/smart-prescription-system.git
```
2️⃣ Import Project
Open Eclipse or any Java IDE and import the project as a Maven project.
3️⃣ Configure Database
Create a MySQL database and update hibernate.cfg.xml with your database credentials.
4️⃣ Run the Application
Execute PrescriptionMain.java to start the system.
📝 Usage
🔹 Pharmacists can register, log in, and manage medicines.
🔹 Patients can search for medicines based on medical conditions.
🔹 Hibernate ORM ensures efficient interaction with MySQL.

📌 Future Enhancements
🔸 Implement a web-based UI for a better user experience.
🔸 Integrate Spring Boot for enhanced scalability.
🔸 Add API endpoints for external system integration.

🤝 Contributing
Contributions are welcome! Fork the repository, make changes, and submit a pull request.

📜 License
This project is licensed under the MIT License.
