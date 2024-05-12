#BLOG APP 
This is a web application that allows users to create and manage their own blogs. It provides a user-friendly interface for creating and editing posts, managing comments, and controlling user access based on two roles: ROLE_ADMIN and ROLE_USER.

#Features:-
User registration and authentication using JWT authentication
Two user roles: ROLE_ADMIN and ROLE_USER
Users can create and update their own posts
Users can comment on posts
Users can delete their own posts and comments
Admins can delete any posts and comments
Input validation using Bean Validator
Mapping between DTO and Entity objects using ModelMapper API
Database storage using MySQL
Build automation using Maven
Lombok for reducing boilerplate code


#Requirements
Java 17 or higher
MySQL
Postman

#Installation
Create a MySQL database named blogdb.
Set the database username and password in the application.properties file.
Build the project using Maven by running the following command in the project directory:
mvn clean package Run the application using the following command:


#Usage
To access the application, go to http://localhost:8080/auth/login in your web browser.
Use the registration page to create a new user account with either ROLE_ADMIN or ROLE_USER.
Once logged in, users can create and manage their own posts, as well as comment on other users' posts.
Admins can manage all posts and comments.



