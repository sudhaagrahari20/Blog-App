# BLOG APP 
This is a web application that allows users to create and manage their own blogs. It provides a user-friendly interface for creating and editing posts, managing comments, and controlling user access based on two roles:
ROLE_ADMIN and ROLE_USER.

# Features:-
. User registration and authentication using JWT authentication                                                                                                              
- Two user roles: ROLE_ADMIN and ROLE_USER
3- Users can create and update their own posts
4- Users can comment on posts
5- Users can delete their own posts and comments
6- Admins can delete any posts and comments
7- Input validation using Bean Validator
8- Mapping between DTO and Entity objects using ModelMapper API
9 -Database storage using MySQL
10- Build automation using Maven
11- Lombok for reducing boilerplate code


# Requirements
Java 17 or higher,
MySQL,
Postman,
Lombok,
Maven (Optional)

# Installation
Create a MySQL database named blogdb.
Set the database username and password in the application.properties file.
Build the project using Maven by running the following command in the project directory:
mvn clean package Run the application using the following command:


# Usage
To access the application, go to http://localhost:8080/auth/login in your web browser.
Use the registration page to create a new user account with either ROLE_ADMIN or ROLE_USER.
Once logged in, users can create and manage their own posts, as well as comment on other users' posts.
Admins can manage all posts and comments.



