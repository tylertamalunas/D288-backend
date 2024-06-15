<strong> **DO NOT DISTRIBUTE OR PUBLICLY POST SOLUTIONS TO THESE LABS. MAKE ALL FORKS OF THIS REPOSITORY WITH SOLUTION CODE PRIVATE. PLEASE REFER TO THE STUDENT CODE OF CONDUCT AND ETHICAL EXPECTATIONS FOR COLLEGE OF INFORMATION TECHNOLOGY STUDENTS FOR SPECIFICS. ** </strong>
# WESTERN GOVERNOR UNIVERSITY 
## D288 – BACK-END PROGRAMMING
Welcome to Back-End Programming! This is an opportunity for students to develop object-oriented applications that can be integrated with relational databases, write code for object-oriented applications using Spring framework, and implements design patterns for object-oriented applications. 
FOR SPECIFIC TASK INSTRUCTIONS AND REQUIREMENTS FOR THIS ASSESSMENT, PLEASE REFER TO THE COURSE PAGE.
## BASIC INSTRUCTIONS
For this project, you will be building your project using IntelliJ IDEA (Ultimate Edition) in a WGU-provided lab environment. You will be working with an existing MySQL database and Angular front-end, which are supplied for you in the lab environment. You will share this project to a private external GitLab repository and backup regularly. If you wish to work on it on your local machine, you will also need to download the Angular front-end application and create your own MySQL database. Use the links on your course page to install the integrated development environments (IDE), MySQL WorkBench, and IntelliJ IDEA, and pull the project from the lab environment.  



## C.   Construct four new packages, one for each of the following: controllers, entities, dao, and services. The packages will need to be used for a checkout form and vacations packages list.
- added contents of application.properties file.
- Created packages
- added RestDataConfig file to config package and edited to fit project.


## D.   Write code for the entities package that includes entity classes and the enum designed to match the UML diagram.
- Created all entities and added attributes
- 

## E.   Write code for the dao package that includes repository interfaces for the entities that extend JpaRepository, and add cross-origin support.


## F.   Write code for the services package that includes each of the following:

•    a purchase data class with a customer cart and a set of cart items

•    a purchase response data class that contains an order tracking number

•    a checkout service interface

•    a checkout service implementation class



## G.   Write code to include validation to enforce the inputs needed by the Angular front-end.


## H.   Write code for the controllers package that includes a REST controller checkout controller class with a post mapping to place orders.


Note: You do not need to duplicate REST functionality for each repository by creating methods in Java.


## I.   Add five sample customers to the application programmatically.


Note: Make sure the customer information is not overwritten each time you run the application.


## J.   Run your integrated application by adding a customer order for a vacation with two excursions using the unmodified Angular front-end. Provide screenshots for the following:

•    that your application does not generate a network error when adding the data

•    your database tables using MySQL Workbench to show the data was successfully added



Note: The screenshot should include the front-end view and the inspection console in the browser.
