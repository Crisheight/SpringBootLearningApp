# Enterprise Workforce Management System

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![Spring Boot](https://img.shields.io/badge/Spring_Boot-6DB33F?style=for-the-badge&logo=spring-boot&logoColor=white)
![PostgreSQL](https://img.shields.io/badge/PostgreSQL-316192?style=for-the-badge&logo=postgresql&logoColor=white)
![Maven](https://img.shields.io/badge/Maven-C71A36?style=for-the-badge&logo=Apache%20Maven&logoColor=white)
![JUnit 5](https://img.shields.io/badge/JUnit5-25A162?style=for-the-badge&logo=junit5&logoColor=white)
![Mockito](https://img.shields.io/badge/Mockito-8DCE8D?style=for-the-badge&logo=mockito&logoColor=white)
![License: MIT](https://img.shields.io/badge/License-MIT-blue.svg?style=for-the-badge)

A high-performance, RESTful attendance management API built with Spring Boot. This system provides a reliable backend for tracking workforce attendance, managing student/employee records, and retrieving historical data with optimized data access.

## 🏗 Architecture

The application follows a clean, standard 3-tier architecture to ensure separation of concerns and maintainability:

* **Controller Layer:** Handles incoming HTTP requests and routes them appropriately.
* **Service Layer:** Contains the core business logic and transaction management.
* **Data Access Layer:** Utilizes Spring Data JPA for seamless, secure interactions with the PostgreSQL database.

## 🛠 Tech Stack

* **Language:** Java
* **Framework:** Spring Boot, Spring Data JPA
* **Database:** PostgreSQL
* **Build Tool:** Maven
* **Testing:** JUnit 5, Mockito

## 📡 API Reference

### Core Endpoints

| Method | Endpoint | Description |
| :--- | :--- | :--- |
| `GET` | `/api/students` | Retrieves a list of all registered students/employees |
| `GET` | `/api/students/{id}` | Fetch detailed records for a specific student |
| `POST` | `/api/attendance` | Records a new attendance entry |
| `GET` | `/api/attendance/{date}` | Fetches all attendance records for a specific date |

## ⚙️ Local Development Setup

**Prerequisites:**
* Java Development Kit (JDK)
* PostgreSQL running locally or via Docker
* Maven

**Steps:**
1.  **Clone the repository:**
    ```bash
    git clone [https://github.com/criscoded/workforce-management-api.git](https://github.com/criscoded/workforce-management-api.git)
    cd workforce-management-api
    ```

2.  **Configure the Database:**
    Update the `src/main/resources/application.properties` file with your local PostgreSQL credentials:
    ```properties
    spring.datasource.url=jdbc:postgresql://localhost:5432/workforcedb
    spring.datasource.username=your_username
    spring.datasource.password=your_password
    ```

3.  **Build and Test:**
    Run the comprehensive automated test suite to ensure everything is functioning correctly.
    ```bash
    mvn clean test
    ```

4.  **Run the Application:**
    ```bash
    mvn spring-boot:run
    ```

## 🧪 Testing Strategy

Quality is ensured through a comprehensive automated test suite. 
* **JUnit 5** is used for unit and integration testing.
* **Mockito** is utilized to mock dependencies in the service layer, isolating unit tests and ensuring fast execution.

## 📝 License

Distributed under the MIT License. See `LICENSE` for more information.

---

## ![Technical Visualizations](https://img.shields.io/badge/Technical_Visualizations-4B0082?style=for-the-badge&logo=readthedocs&logoColor=white)

### Spring Beans & Dependency Injection



* What is a bean
* How to make a project a springboot project
* different dependency injection in Spring, such as the preferred constructor injection, but also setter injection and field injection

![Screenshot 2024-12-16 at 4 15 42 PM](https://github.com/user-attachments/assets/d5353cea-08e1-4846-8be5-845609e15f7f)
![Screenshot 2024-12-16 at 4 15 42 PM](https://github.com/user-attachments/assets/9305a613-ba32-487a-ae3b-b05321adb423)
![Screenshot 2024-12-16 at 4 15 31 PM](https://github.com/user-attachments/assets/9723f819-f7ad-4d73-b936-ff2284ad160e)
![Screenshot 2024-12-16 at 4 15 22 PM](https://github.com/user-attachments/assets/4e26c93d-be49-4c18-9d79-d248cf73eaa8)

### Spring Profiles

* Allow us to have profile-specific beans for different environments
* ex: a bean that prints useful stuff on dev profile would not be included in production
* Ability to use a small and quick database in dev vs a full database in production
* Explicitly setting which profile to use in application.properties
* Separate the default spring application constructor (main.class, arg) - allows us to declare and use spring profiles in a map before calling .run(args) 
* Profiles can be set at class or method level which can affect how beans are registered (class or method) 

![Screenshot 2024-12-17 at 11 00 54 PM](https://github.com/user-attachments/assets/cc82da8b-10e7-48a4-aeb8-b6cfd143c7e2)
![Screenshot 2024-12-17 at 11 00 31 PM](https://github.com/user-attachments/assets/f1e2c9cc-c723-45e4-84e7-b370a278f58f)
![Screenshot 2024-12-17 at 11 00 42 PM](https://github.com/user-attachments/assets/05a12a5a-cc09-45fa-a3de-4a83f8e163db)
![Screenshot 2024-12-18 at 12 14 54 AM](https://github.com/user-attachments/assets/90572af3-b2bc-4ca9-802d-c1f171e54225)
![Screenshot 2024-12-18 150554](https://github.com/user-attachments/assets/4b29ef85-f430-4fb6-badb-96cb5df6a018)
![Screenshot 2024-12-18 152959](https://github.com/user-attachments/assets/e21243b3-1764-4670-b50a-d75498e0da51)

### HTTP Methods

* GET POST PUT DELETE PATCH OPTIONS HEAD
* 1XX 2XX 3XX 4XX 5XX -> Informational, Success, Redirection, Client Error, Server Error
* 200 OK, 201 Created, 204 No Content, 
* 400 Bad Request, 401 Unauthorized, 403 Forbidden, 404 Not Found, 405 Method Not Allowed, 
* 500 Internal Server Error, 503 Service Unavailable

### Spring REST

* Use RestController annotation (combines @Controller and @ResponseBody) to prep the class
* Use annotations over methods to send requests ex: @GetMapping for GET requests
* Importance of using endpoints & naming conventions
* Using @ResponseStatus to change the status code

#### HTTP Status Implementation

We can see how Http status is implemented. In this case it gives us commands that correlate to HTTP status codes.

![Screenshot 2024-12-21 140335](https://github.com/user-attachments/assets/844eef03-84a7-4166-bd30-9f720f7de411)
![Screenshot 2024-12-21 140335](https://github.com/user-attachments/assets/a9e291e9-1eed-4341-ac40-5710f0f6cb9f)

#### REST Controller Class

Annotate the class as a rest controller and implement a method.

During startup we can see Spring use Tomcat for the server. It reports the port it's opened on and the context path.

![Screenshot 2024-12-21 135233](https://github.com/user-attachments/assets/bfbe7649-6057-4e23-9eda-20e620166cdb)
![Screenshot 2024-12-21 135920](https://github.com/user-attachments/assets/e5ddcf25-75b6-43a7-8044-c383af565f4a)
![Screenshot 2024-12-21 135239](https://github.com/user-attachments/assets/89829cf8-efc5-4573-8e93-2076a21b999e)

#### GET Requests

Similar to how we can name Spring Bean annotations, we can provide paths for the Get request to map to. This is good practice.

With the two methods having different paths, we can specify different status codes as well.

The browser address bar essentially sends a GET request when you enter a URL and press enter.

A GET request is designed to retrieve a resource.

![Screenshot 2024-12-22 at 8 32 14 PM](https://github.com/user-attachments/assets/84451525-3c8f-4481-a7a5-27fced280478)
![Screenshot 2024-12-21 135645](https://github.com/user-attachments/assets/cf794457-0b95-4f1d-b138-a938c837091a)
![Screenshot 2024-12-21 140024](https://github.com/user-attachments/assets/7d10adb2-d88b-4919-a5bb-6573b1a2e208)
![Screenshot 2024-12-21 140436](https://github.com/user-attachments/assets/329ec307-0bf2-48f2-b290-495f540ab28a)

#### POST Requests

We can easily use an annotation to setup a POST request. 

Unlike GET requests, POST requests cannot be reached by hitting an endpoint on the browser.

POST data is sent in the body of the HTTP Request itself, not in the URL.

POST data is designed to send data to the server to create or update a resource.

![Screenshot 2024-12-23 at 11 04 38 PM](https://github.com/user-attachments/assets/3bf710c7-64c3-4423-b08b-57be202e341e)
![Screenshot 2024-12-23 at 11 06 03 PM](https://github.com/user-attachments/assets/e49d6e49-f401-4a62-9920-9e9b5b40831e)

#### Using Postman or Curl to Make Requests

Postman is an application that makes it easy to generate REST requests using a GUI.

Alternatively, curl is the CLI method to creating REST requests. Powerful in its own way.

Here I make a GET request to the greetings endpoint. I receive a response from the server.

![Screenshot 2024-12-25 at 3 59 59 PM](https://github.com/user-attachments/assets/82a68f47-8101-4460-ae19-d28656635ea9)

When making a POST request, the request goes through but Spring is not correctly translating the message.

![Screenshot 2024-12-25 at 9 08 11 PM](https://github.com/user-attachments/assets/2dfa1dcf-769a-485c-9482-9c4d18104305)

We can look at the code by adding a breakpoint and using the debugger mode to see if there are issues.

![Screenshot 2024-12-25 at 9 08 34 PM](https://github.com/user-attachments/assets/59263a4b-5eba-4e3c-a7b1-1f58fd461d69)
![Screenshot 2024-12-25 at 9 08 47 PM](https://github.com/user-attachments/assets/663bdae6-776d-465b-9ca4-15fa630105f7)

The program is not inherently incorrect, it is that Spring framework expects the body to be annotated in order for it to translate the request.

We can annotate the parameter field so that Spring expects a response body.

![Screenshot 2024-12-25 at 9 25 51 PM](https://github.com/user-attachments/assets/8006b0e7-41f5-4171-94e8-65d8f3f6b7db)

Now, running the request with raw data is successful.

![Screenshot 2024-12-25 at 9 13 37 PM](https://github.com/user-attachments/assets/c9461732-d42a-48e1-a56a-dda2f04f13e6)

We can also send the response body as JSON, and it works.

![Screenshot 2024-12-25 at 9 20 28 PM](https://github.com/user-attachments/assets/07d1a1d8-07ee-4caa-8d55-3532b8834dc3)

Creating a new endpoint that returns a different type is simple. In this case we return the string representation of an order object.

![Screenshot 2024-12-28 at 7 30 04 PM](https://github.com/user-attachments/assets/84a2f4b9-fb8f-42ea-90f8-d665b8ed397d)
![Screenshot 2024-12-28 at 7 30 18 PM](https://github.com/user-attachments/assets/bbfb56e1-8d69-43b9-b25d-2fe8e3b18e03)

We can also escape in the terminal with "\" , which allows the formatting to be spaced out and cleaner.

![Screenshot 2024-12-28 at 7 29 52 PM](https://github.com/user-attachments/assets/aeee5668-110e-457d-a0a8-0c0c261425f3)

By default when you call toString() method on an object in Java, it returns the object reference - a hash code. Of course, we can choose to override the default toString method if we want a different result.

In addition to the toString() method being in a default state, our objects are private with no accessors. By changing these, we can allow the JSON post to map to the objects. I have swapped to Postman to help visualize the state of the objects after the request. 

![Screenshot 2025-01-15 at 9 13 03 PM](https://github.com/user-attachments/assets/f7d93532-27ae-4eab-87fb-8c26e5dbf939)
![Screenshot 2025-01-15 at 9 13 51 PM](https://github.com/user-attachments/assets/9e9e6c34-d376-4511-a8cd-fb6f385c655c)
![Screenshot 2025-01-15 at 9 15 49 PM](https://github.com/user-attachments/assets/998a15bb-e678-4c96-ae7d-a4ab86e3a18a)
![Screenshot 2025-01-15 at 9 16 42 PM](https://github.com/user-attachments/assets/d4f0141b-ffd2-446d-8cb1-ff48ffb7d2fd)

#### Getters and Setters vs Records

Java records were introduced to provide similar functionality with minimal boilerplate. A Java record essentially automatically generates the getter methods, toString, equals, hashCode, and constructor. 

Traditional methods have benefits over records, such as being mutable, and enabling further/deeper custom logic and behavior.

By using the JsonProperty annotation, we can individually name Java objects as needed, but the HTTP request must mirror those changes in order to be successful (they must match and are case sensitive).

![Screenshot 2025-01-15 at 9 45 53 PM](https://github.com/user-attachments/assets/86df5471-ab83-46ae-98d6-a1060c074327)
![Screenshot 2025-01-15 at 9 46 00 PM](https://github.com/user-attachments/assets/90bb8820-e999-4d44-acac-aa710a9e073b)
![Screenshot 2025-01-15 at 9 46 03 PM](https://github.com/user-attachments/assets/d28ae4b6-c7ee-41e1-a9c6-7684c7cd3358)

### Java Records

As stated previously, Java Records provide a lot of heavy lifting out of the box. In this case we create a new record, an endpoint for it, and then we send an http request.

![Screenshot 2025-01-15 at 10 10 44 PM](https://github.com/user-attachments/assets/a277ff47-6475-4eb5-8c61-39adf6e72ca2)

The request is the same as previous ones, with the object names needing to match the request.

### Database and CRUD Operations



By leveraging a databse, Postgres in this case, we can begin to implement relationships in the codebase, which let's us leverage these relationships by using CRUD operations - create, read, update, and delete.

Using Spring, we are able to use annotations in the code to specify primary and secondary relationships, keys, etc. -> It abstracts the raw SQL commands for us, although you should keep them toggled on in the logger (when the program is run) to determine if commands are incorrect or can be optimized.

Tools can be equally important when working with complex data across a project. In this way, intelliJ IDE provides various ways to see the actions you are doing, both visually and typed.

Database:

![Screenshot 2025-07-21 at 5 12 03 PM](https://github.com/user-attachments/assets/69eb72ab-5bd7-4a09-874c-51b7b9bbf7ef)
![Screenshot 2025-07-21 at 5 12 15 PM](https://github.com/user-attachments/assets/1c4fa927-7ff9-4006-bfa6-c7b491693b37)
![Screenshot 2025-07-21 at 5 12 24 PM](https://github.com/user-attachments/assets/d4d71b54-2df9-4207-99b7-ef6f71a2f965)

CRUD Operations:

![Screenshot 2025-07-21 at 5 10 53 PM](https://github.com/user-attachments/assets/5d33a612-bd42-4a2f-8023-5d0ac7388958)
![Screenshot 2025-07-21 at 5 11 01 PM](https://github.com/user-attachments/assets/6d7c7a26-7eb0-44c2-9f3b-66003be5ac5c)
![Screenshot 2025-07-21 at 5 11 07 PM](https://github.com/user-attachments/assets/8aa1ffb5-96b2-4802-b858-0cd214fe5f4a)
![Screenshot 2025-07-21 at 5 11 17 PM](https://github.com/user-attachments/assets/18f6fb37-4088-43f9-8cc7-e74d47f7f12e)
![Screenshot 2025-07-21 at 5 11 30 PM](https://github.com/user-attachments/assets/90c445ef-b10f-406d-9eac-4be498b4e7fb)
![Screenshot 2025-07-21 at 5 20 36 PM](https://github.com/user-attachments/assets/263c46f0-b10c-4a1d-b323-6eb02193fdf1)

The database contents consists of a one-to-one relationship, and a one-to-many relationship

Using Spring annotations comes with its quirks: We needed to specify that School was a "JsonManagedReference" as the parent, so that when a list of Student objects were called by the database with a GET request, that the individual student objects returned didn't continually try to serialize the School. This circumvents an infinite loop of requests that would otherwise happen.

### DTO Pattern



Previous we were using an older and more conventionally taught OOP- object-oriented programming- style that becomes unweildy as we begin to handle more complex data and relationships. For instance, as we add additional things into the database, we might need to start adding many more inputs for each Studen object GET request. This can create easy mistakes over time as the data becomes more coupled and the process becomes more complex.

Enter DTO- data transfer object- pattern, which is a software design pattern meant to encapsulate and structure data that needs to be transferred between different parts of the system, or different systems entirely. DTO can also be used to help us hide sensitive information that the user or others do not need to view. In our case, we can hide the Student's PII- personally identififiable information- in ways that we could not before.

By introducing a mapper, we will be able to implement DTO patterns. For example, we can have multiple representations for one object. That is to say, for a Student object we might have one representation that only exposes a first and last name, while a second representation exposes or receives data to create a new student object. By combining this ability with CRUD operations, we can appropriately obfuscate information on a need-to-know basis.

In short, DTO's provide data separation,an abstraction layer, and flexibility all while improving performance.

Applying DTO in the code lets us decouple the controller layer with a new service layer. This means that we can make changes to the service layer without changing code in the controller layer, something we couldn't do previously.

New service layer in action

![Screenshot 2025-07-24 at 4 54 58 PM](https://github.com/user-attachments/assets/6bef5c0f-0101-4d96-9d64-6046333e287c)

Controller layer gets simplified due to the service layer

![Screenshot 2025-07-24 at 4 55 46 PM](https://github.com/user-attachments/assets/2166fd8e-aa73-43d0-9c83-14009099d577)
![Screenshot 2025-07-24 at 4 57 10 PM](https://github.com/user-attachments/assets/ae2713fe-c764-4cd2-b5e8-b7bb28c38acc)

### Project Layout

With the implementation of DTO we have decoupled the controller layer by adding a service layer. At this point the project should be better organized in case future work needs to be done with the classes we have made. By applying a by-feature style of organiztaion we can help readability and maintanability by ourselves and others.

By-feature organization style

![Screenshot 2025-07-28 at 6 01 28 PM](https://github.com/user-attachments/assets/8f997b2d-b4d5-4953-b993-b10df6105154)

### Tests

By adding guards in the code we can prevent errors. For instance, we can guard against null objects, and we can create tests to see not only if method calls are correct, but if they are being appropriately called singular or multiple times.

Guarding against null

![Screenshot 2025-07-31 at 3 31 35 PM](https://github.com/user-attachments/assets/5c1cc272-0f21-4748-afca-e4986a45cf80)

The POST request confirms the null guard is working and returns our message

![Screenshot 2025-07-28 at 6 36 22 PM](https://github.com/user-attachments/assets/250c254e-8229-4c58-a5cb-45b98a75af75)

Tests involve injecting mock objects and methods in an independant manner separate from the rest of the other classes. We use Mockito to achieve this, which grants us annotations that provide clarity but also this functionality. For instance @BeforeEach will apply the code block before each method, while @AfterEach will apply the code block at the end of each method. Similarly there are annotations for singular useage, etc.

Test with Mocks

![Screenshot 2025-07-31 at 3 17 14 PM](https://github.com/user-attachments/assets/269ba052-a76e-46f0-a1d8-717a1d0a5f2f)

Mockito lets us assert that certain things are the same, such as the original object size should be the same as the new object size, and verify the number of calls.

Assert and verify

![Screenshot 2025-07-31 at 3 17 26 PM](https://github.com/user-attachments/assets/6b40eb38-b315-4e9d-98cb-37d32200eeab)
