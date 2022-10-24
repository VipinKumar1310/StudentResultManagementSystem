# Student_Result_Managment_System
* Built a Student Result management system GUI application to help the admin store various data such as course result declaration , student details and to help student’s check their own result. -Added functionaly for admin to add/list student detail , add/list/update student result and for student to search for their result. -Used mysql database to store/fetch data entered into the GUI.

* Used mysql JDBC driver library to connect the library : JDBC drivers are Java library files with the extension .jar used by all Java applications to connect to the database. Usually, they are provided by the same company which implemented the MySql software. DbSchema Tool already includes an MySql driver, which is automatically downloaded when you connect to MySql.

* rs2xml.jar library to fetch the data from database.

# About The Project
* Student result management system project having two modules:

  1 Student module: In this module we have to enter roll number to see user or student result. When we enter wrong roll number it will show popup message incorrect roll number.When we enter correct roll number then it moves to next page where we can see results of different subject.

  2 Admin module: In this module we can add new student and add new result. If we want to add an existing roll number or student details then we get error message.we can also see student details and student result.

# Software used:
* Netbeans downloading link: https://netbeans.org/downloads/8.2/rc/

* For this project use mysql version :5.5.45 Link to download mysql-5.5.45: https://drive.google.com/file/d/1nNmOcmICQ9k4z1hCob_h4Gs0ICKXPA2P/view?usp=sharing

# Jar file used:

* rs2xml Link: https://drive.google.com/file/d/1tbPV3TShgOABXlEhry-Km2h9pV7bIdR6/view?usp=sharing

# MySql
* MySQL is a database management system that is used to maintain relational databases. It is an open-source software backed by Oracle Corporation. This was originally founded by a Swedish company called MYSQL AB which was later acquired by sun microsystems and finally is with Oracle Corporation. As it is an open-source database system, the source code can be modified according to our needs. It also offers premium services if a commercial license is purchased from Oracle Corporation. MySQL is a scalable, fast, and reliable database management system which can run on any platform like Windows, Unix, Linux, etc., and can be installed on the desktop or any server machine.
# Used sql
* The format for this file is -> Command Description : SQL command\

* Create Database : CREATE DATABASE StudentResultSystem;

* Use Database : USE StudentResultSystem;

* Create student table : CREATE TABLE student(name VARCHAR(100),fathername VARCHAR(40), rollNo VARCHAR(10) PRIMARY KEY, gender VARCHAR(6), branchName VARCHAR(20));

* Look at the description of student table : DESC student;

* Insert a row in student table : INSERT INTO student VALUES('Sam', 'Ram','1', 'Male', 'Civil');

* List the student table : SELECT * FROM student;

* Create result table : CREATE TABLE result(rollNo VARCHAR(10) PRIMARY KEY, physics INT, chemistry INT,maths INT, electrical INT, compSci INT, result INT);

* Look at the description of result table : DESC result;

* Update a row in result table : UPDATE result SET physics = 10, chemistry = 30, maths = 20, electrical = 40, compSci=50, result = 150 WHERE rollNo='1';

* List the result table : SELECT * FROM result;

* Inner Join student and result table based on roll No. Column : SELECT * FROM student INNER JOIN result WHERE student.rollNo=result.rollNo;

# Java Swing and awt
* AWT and Swing are used to develop window-based applications in Java. Awt is an abstract window toolkit that provides various component classes like Label, Button, TextField, etc., to show window components on the screen. All these classes are part of the Java.awt package.

* On the other hand, Swing is the part of JFC (Java Foundation Classes) built on the top of AWT and written entirely in Java . The javax.swing API provides all the component classes like JButton, JTextField, JCheckbox, JMenu, etc.

* The components of Swing are platform-independent, i.e., swing doesn't depend on the operating system to show the components. Also, the Swing's components are lightweight.

# Conclusion
* By now I’m sure you understand exactly how to Make a connection with database and how we can store and update the Information and also learned java swing and awt and help of that how can we make a beautiful GUL,I hope y’all enjoyed reading this article as much as I enjoyed writing it!
