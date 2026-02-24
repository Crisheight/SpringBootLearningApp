# Workforce Management API

A high-performance, RESTful attendance management system built with Spring Boot. This service provides a robust backend for tracking attendance, managing student records, and ensuring data integrity through a strictly typed JPA persistence layer

# Core Architecture

The system is built on the Spring Framework, utilizing a tiered architecture to separate concerns and ensure scalability:

* Controller Layer: Handles RESTful request mapping and provides standardized HTTP response codes (201 Created, 204 No Content, 404 Not Found) for a predictable API consumer experience

* Service Layer: Encapsulates business logic, utilizing Spring Bean Dependency Injection (Constructor-based) for loose coupling and easier testing

* Data Access Layer (JPA/Hibernate): Leverages Spring Data JPA for efficient interaction with relational databases, abstracting complex SQL queries into maintainable repository interfaces

# Key Technical Implementations

* Dependency Injection: Implements best-practice constructor injection to manage bean lifecycles, ensuring the system is modular and units remain testable

* Automated Testing & Quality Assurance: Features a comprehensive test suite powered by JUnit 5 and Mockito

* Unit Testing: Isolated service testing using mocks to verify business logic behavior

* Verification: Utilizes Mockito to assert object states and verify interaction counts, ensuring critical paths (like database writes) are executed correctly

* Persistence & Schema Management: Uses JPA annotations to define entity relationships, ensuring that the database schema remains synchronized with the Java object model

# API Endpoints

The API follows standard REST principles to manage resources:

|Endpoint|Method|Description|
|--------|------|-----------|
|GET|/api/students|Retrieve a paginated list of all students|
|GET|/api/students/{id}|Fetch detailed records for a specific student|
|POST|/api/attendance|Log a new attendance record with validation|
|GET|/api/attendance/{date}|Filter records by specific calendar dates|

# Technical Visualizations

<h1>SPRING BEANS & DEPENDENCY INJECTION</h1>

* What is a bean
* How to make a project a springboot project
* different dependency injection in Spring, such as the preferred constructor injection, but also setter injection and field injection

<img width="705" alt="Screenshot 2024-12-16 at 4 15 42 PM" src="https://github.com/user-attachments/assets/d5353cea-08e1-4846-8be5-845609e15f7f" />
<img width="705" alt="Screenshot 2024-12-16 at 4 15 42 PM" src="https://github.com/user-attachments/assets/9305a613-ba32-487a-ae3b-b05321adb423" />
<img width="539" alt="Screenshot 2024-12-16 at 4 15 31 PM" src="https://github.com/user-attachments/assets/9723f819-f7ad-4d73-b936-ff2284ad160e" />
<img width="801" alt="Screenshot 2024-12-16 at 4 15 22 PM" src="https://github.com/user-attachments/assets/4e26c93d-be49-4c18-9d79-d248cf73eaa8" />

<h1>SPRING PROFILES</h1>

* Allow us to have profile-specific beans for different environments
* ex: a bean that prints useful stuff on dev profile would not be included in production
* Ability to use a small and quick database in dev vs a full database in production
* Explicitly setting which profile to use in application.properties
* Separate the default spring application constructor (main.class, arg) - allows us to declare and use spring profiles in a map before calling .run(args) 
* Profiles can be set at class or method level which can affect how beans are registered (class or method) 

<img width="1232" alt="Screenshot 2024-12-17 at 11 00 54 PM" src="https://github.com/user-attachments/assets/cc82da8b-10e7-48a4-aeb8-b6cfd143c7e2" />
<img width="786" alt="Screenshot 2024-12-17 at 11 00 31 PM" src="https://github.com/user-attachments/assets/f1e2c9cc-c723-45e4-84e7-b370a278f58f" />
<img width="727" alt="Screenshot 2024-12-17 at 11 00 42 PM" src="https://github.com/user-attachments/assets/05a12a5a-cc09-45fa-a3de-4a83f8e163db" />
<img width="416" alt="Screenshot 2024-12-18 at 12 14 54 AM" src="https://github.com/user-attachments/assets/90572af3-b2bc-4ca9-802d-c1f171e54225" />
<img alt="Screenshot 2024-12-18 150554" src="https://github.com/user-attachments/assets/4b29ef85-f430-4fb6-badb-96cb5df6a018" />
<img alt="Screenshot 2024-12-18 152959" src="https://github.com/user-attachments/assets/e21243b3-1764-4670-b50a-d75498e0da51" />

<h1>HTTP METHODS</h1>

* GET POST PUT DELETE PATCH OPTIONS HEAD
* 1XX 2XX 3XX 4XX 5XX -> Informational, Success, Redirection, Client Error, Server Error
* 200 OK, 201 Created, 204 No Content, 
* 400 Bad Request, 401 Unauthorized, 403 Forbidden, 404 Not Found, 405 Method Not Allowed, 
* 500 Internal Server Error, 503 Service Unavailable

<h1>CODE RESET</h1>

* Files and code removed
* Preparation for building out Spring REST 
* Renamed main application to ExampleApplication 

<h1>SPRING REST</h1>

* Use RestController annotation (combines @Controller and @ResponseBody) to prep the class
* Use annotations over methods to send requests ex: @GetMapping for GET requests
* Importance of using endpoints & naming conventions
* Using @ResponseStatus to change the status code

<h2>HTTP Status Implementation</h2>
<p>We can see how Http status is implemented. In this case it gives us commands that correlate to HTTP status codes.</p>

<img alt="Screenshot 2024-12-21 140335" src="https://github.com/user-attachments/assets/844eef03-84a7-4166-bd30-9f720f7de411" />
<img alt="Screenshot 2024-12-21 140335" src="https://github.com/user-attachments/assets/a9e291e9-1eed-4341-ac40-5710f0f6cb9f" />

<h2>REST Controller Class</h2>
<p>Annotate the class as a rest controller and implement a method.</p>
<p>During startup we can see Spring use Tomcat for the server. It reports the port it's opened on and the context path.</p>

<img alt="Screenshot 2024-12-21 135233" src="https://github.com/user-attachments/assets/bfbe7649-6057-4e23-9eda-20e620166cdb" />
<img alt="Screenshot 2024-12-21 135920" src="https://github.com/user-attachments/assets/e5ddcf25-75b6-43a7-8044-c383af565f4a" />
<img alt="Screenshot 2024-12-21 135239" src="https://github.com/user-attachments/assets/89829cf8-efc5-4573-8e93-2076a21b999e" />

<h2>GET Requests</h2>
<p>Similar to how we can name Spring Bean annotations, we can provide paths for the Get request to map to. This is good practice.</p>
<p>With the two methods having different paths, we can specify different status codes as well.</p>
<p>The browser address bar essentially sends a GET request when you enter a URL and press enter.</p>
<p>A GET request is designed to retrieve a resource.</p>

<img width="650" alt="Screenshot 2024-12-22 at 8 32 14 PM" src="https://github.com/user-attachments/assets/84451525-3c8f-4481-a7a5-27fced280478" />
<img alt="Screenshot 2024-12-21 135645" src="https://github.com/user-attachments/assets/cf794457-0b95-4f1d-b138-a938c837091a" />
<img alt="Screenshot 2024-12-21 140024" src="https://github.com/user-attachments/assets/7d10adb2-d88b-4919-a5bb-6573b1a2e208" />
<img alt="Screenshot 2024-12-21 140436" src="https://github.com/user-attachments/assets/329ec307-0bf2-48f2-b290-495f540ab28a" />

<h2>POST Requests</h2>
<p>We can easily use an annotation to setup a POST request. </p>
<p>Unlike GET requests, POST requests cannot be reached by hitting an endpoint on the browser.</p>
<p>POST data is sent in the body of the HTTP Request itself, not in the URL.</p>
<p>POST data is designed to send data to the server to create or update a resource.</p>

<img width="648" alt="Screenshot 2024-12-23 at 11 04 38 PM" src="https://github.com/user-attachments/assets/3bf710c7-64c3-4423-b08b-57be202e341e" />
<img width="554" alt="Screenshot 2024-12-23 at 11 06 03 PM" src="https://github.com/user-attachments/assets/e49d6e49-f401-4a62-9920-9e9b5b40831e" />

<h2>Using Postman or Curl to Make Requests</h2>
<p>Postman is an application that makes it easy to generate REST requests using a GUI.</p>
<p>Alternatively, curl is the CLI method to creating REST requests. Powerful in its own way.</p>

<p>Here I make a GET request to the greetings endpoint. I receive a response from the server.</p>
<img width="379" alt="Screenshot 2024-12-25 at 3 59 59 PM" src="https://github.com/user-attachments/assets/82a68f47-8101-4460-ae19-d28656635ea9" />

<p>When making a POST request, the request goes through but Spring is not correctly translating the message.</p>
<img width="766" alt="Screenshot 2024-12-25 at 9 08 11 PM" src="https://github.com/user-attachments/assets/2dfa1dcf-769a-485c-9482-9c4d18104305" />

<p>We can look at the code by adding a breakpoint and using the debugger mode to see if there are issues.</p>
<img width="746" alt="Screenshot 2024-12-25 at 9 08 34 PM" src="https://github.com/user-attachments/assets/59263a4b-5eba-4e3c-a7b1-1f58fd461d69" />
<img width="627" alt="Screenshot 2024-12-25 at 9 08 47 PM" src="https://github.com/user-attachments/assets/663bdae6-776d-465b-9ca4-15fa630105f7" />

<p>The program is not inherently incorrect, it is that Spring framework expects the body to be annotated in order for it to translate the request.</p>
<p>We can annotate the parameter field so that Spring expects a response body.</p>
<img width="543" alt="Screenshot 2024-12-25 at 9 25 51 PM" src="https://github.com/user-attachments/assets/8006b0e7-41f5-4171-94e8-65d8f3f6b7db" />

<p>Now, running the request with raw data is successful.</p>
<img width="479" alt="Screenshot 2024-12-25 at 9 13 37 PM" src="https://github.com/user-attachments/assets/c9461732-d42a-48e1-a56a-dda2f04f13e6" />

<p>We can also send the response body as JSON, and it works.</p>
<img width="969" alt="Screenshot 2024-12-25 at 9 20 28 PM" src="https://github.com/user-attachments/assets/07d1a1d8-07ee-4caa-8d55-3532b8834dc3" />

<p>Creating a new endpoint that returns a different type is simple. In this case we return the string representation of an order object.</p>
<img width="570" alt="Screenshot 2024-12-28 at 7 30 04 PM" src="https://github.com/user-attachments/assets/84a2f4b9-fb8f-42ea-90f8-d665b8ed397d" />
<img width="339" alt="Screenshot 2024-12-28 at 7 30 18 PM" src="https://github.com/user-attachments/assets/bbfb56e1-8d69-43b9-b25d-2fe8e3b18e03" />
<p>We can also escape in the terminal with "\" , which allows the formatting to be spaced out and cleaner.</p>
<img width="571" alt="Screenshot 2024-12-28 at 7 29 52 PM" src="https://github.com/user-attachments/assets/aeee5668-110e-457d-a0a8-0c0c261425f3" />

<p>By default when you call toString() method on an object in Java, it returns the object reference - a hash code. Of course, we can choose to override the default toString method if we want a different result.</p>

<p>In addition to the toString() method being in a default state, our objects are private with no accessors. By changing these, we can allow the JSON post to map to the objects. I have swapped to Postman to help visualize the state of the objects after the request. </p>

<img width="825" alt="Screenshot 2025-01-15 at 9 13 03 PM" src="https://github.com/user-attachments/assets/f7d93532-27ae-4eab-87fb-8c26e5dbf939" />
<img width="290" alt="Screenshot 2025-01-15 at 9 13 51 PM" src="https://github.com/user-attachments/assets/9e9e6c34-d376-4511-a8cd-fb6f385c655c" />
<img width="457" alt="Screenshot 2025-01-15 at 9 15 49 PM" src="https://github.com/user-attachments/assets/998a15bb-e678-4c96-ae7d-a4ab86e3a18a" />
<img width="788" alt="Screenshot 2025-01-15 at 9 16 42 PM" src="https://github.com/user-attachments/assets/d4f0141b-ffd2-446d-8cb1-ff48ffb7d2fd" />

<h2>Getters and Setters vs Records</h3>
<p>Java records were introduced to provide similar functionality with minimal boilerplate. A Java record essentially automatically generates the getter methods, toString, equals, hashCode, and constructor. </p>
<p>Traditional methods have benefits over records, such as being mutable, and enabling further/deeper custom logic and behavior.</p>

<p>By using the JsonProperty annotation, we can individually name Java objects as needed, but the HTTP request must mirror those changes in order to be successful (they must match and are case sensitive).</p>

<img width="341" alt="Screenshot 2025-01-15 at 9 45 53 PM" src="https://github.com/user-attachments/assets/86df5471-ab83-46ae-98d6-a1060c074327" />
<img width="287" alt="Screenshot 2025-01-15 at 9 46 00 PM" src="https://github.com/user-attachments/assets/90bb8820-e999-4d44-acac-aa710a9e073b" />
<img width="768" alt="Screenshot 2025-01-15 at 9 46 03 PM" src="https://github.com/user-attachments/assets/d28ae4b6-c7ee-41e1-a9c6-7684c7cd3358" />

<h1>Java Records</h1>
<p>As stated previously, Java Records provide a lot of heavy lifting out of the box. In this case we create a new record, an endpoint for it, and then we send an http request.</p>

<img width="433" alt="Screenshot 2025-01-15 at 10 10 44 PM" src="https://github.com/user-attachments/assets/a277ff47-6475-4eb5-8c61-39adf6e72ca2" />

<p>The request is the same as previous ones, with the object names needing to match the request.</p>

<h1>Database and CRUD Operations</h1>

<p>By leveraging a databse, Postgres in this case, we can begin to implement relationships in the codebase, which let's us leverage these relationships by using CRUD operations - create, read, update, and delete.</p>

<p>Using Spring, we are able to use annotations in the code to specify primary and secondary relationships, keys, etc. -> It abstracts the raw SQL commands for us, although you should keep them toggled on in the logger (when the program is run) to determine if commands are incorrect or can be optimized.</p>

<p>Tools can be equally important when working with complex data across a project. In this way, intelliJ IDE provides various ways to see the actions you are doing, both visually and typed.</p>

<p>Database:</p>

<img width="415" height="599" alt="Screenshot 2025-07-21 at 5 12 03 PM" src="https://github.com/user-attachments/assets/69eb72ab-5bd7-4a09-874c-51b7b9bbf7ef" />
<img width="405" height="137" alt="Screenshot 2025-07-21 at 5 12 15 PM" src="https://github.com/user-attachments/assets/1c4fa927-7ff9-4006-bfa6-c7b491693b37" />
<img width="880" height="156" alt="Screenshot 2025-07-21 at 5 12 24 PM" src="https://github.com/user-attachments/assets/d4d71b54-2df9-4207-99b7-ef6f71a2f965" />

<p>CRUD Operations:</p>

<img width="630" height="611" alt="Screenshot 2025-07-21 at 5 10 53 PM" src="https://github.com/user-attachments/assets/5d33a612-bd42-4a2f-8023-5d0ac7388958" />
<img width="508" height="652" alt="Screenshot 2025-07-21 at 5 11 01 PM" src="https://github.com/user-attachments/assets/6d7c7a26-7eb0-44c2-9f3b-66003be5ac5c" />
<img width="500" height="583" alt="Screenshot 2025-07-21 at 5 11 07 PM" src="https://github.com/user-attachments/assets/8aa1ffb5-96b2-4802-b858-0cd214fe5f4a" />
<img width="365" height="108" alt="Screenshot 2025-07-21 at 5 11 17 PM" src="https://github.com/user-attachments/assets/18f6fb37-4088-43f9-8cc7-e74d47f7f12e" />
<img width="549" height="472" alt="Screenshot 2025-07-21 at 5 11 30 PM" src="https://github.com/user-attachments/assets/90c445ef-b10f-406d-9eac-4be498b4e7fb" />
<img width="852" height="406" alt="Screenshot 2025-07-21 at 5 20 36 PM" src="https://github.com/user-attachments/assets/263c46f0-b10c-4a1d-b323-6eb02193fdf1" />

<p>The database contents consists of a one-to-one relationship, and a one-to-many relationship</p>

<p>Using Spring annotations comes with its quirks: We needed to specify that School was a "JsonManagedReference" as the parent, so that when a list of Student objects were called by the database with a GET request, that the individual student objects returned didn't continually try to serialize the School. This circumvents an infinite loop of requests that would otherwise happen.</p>

<h1>DTO Pattern</h1>

<p>Previous we were using an older and more conventionally taught OOP- object-oriented programming- style that becomes unweildy as we begin to handle more complex data and relationships. For instance, as we add additional things into the database, we might need to start adding many more inputs for each Studen object GET request. This can create easy mistakes over time as the data becomes more coupled and the process becomes more complex.</p>

<p>Enter DTO- data transfer object- pattern, which is a software design pattern meant to encapsulate and structure data that needs to be transferred between different parts of the system, or different systems entirely. DTO can also be used to help us hide sensitive information that the user or others do not need to view. In our case, we can hide the Student's PII- personally identififiable information- in ways that we could not before.</p>

<p>By introducing a mapper, we will be able to implement DTO patterns. For example, we can have multiple representations for one object. That is to say, for a Student object we might have one representation that only exposes a first and last name, while a second representation exposes or receives data to create a new student object. By combining this ability with CRUD operations, we can appropriately obfuscate information on a need-to-know basis.</p>

<p>In short, DTO's provide data separation,an abstraction layer, and flexibility all while improving performance.</p>

<p>Applying DTO in the code lets us decouple the controller layer with a new service layer. This means that we can make changes to the service layer without changing code in the controller layer, something we couldn't do previously.</p>

<p>New service layer in action</p>

<img width="830" height="488" alt="Screenshot 2025-07-24 at 4 54 58 PM" src="https://github.com/user-attachments/assets/6bef5c0f-0101-4d96-9d64-6046333e287c" />

<p>Controller layer gets simplified due to the service layer</p>

<img width="561" height="199" alt="Screenshot 2025-07-24 at 4 55 46 PM" src="https://github.com/user-attachments/assets/2166fd8e-aa73-43d0-9c83-14009099d577" />
<img width="634" height="123" alt="Screenshot 2025-07-24 at 4 57 10 PM" src="https://github.com/user-attachments/assets/ae2713fe-c764-4cd2-b5e8-b7bb28c38acc" />

<h1>Project Layout</h1>

<p>With the implementation of DTO we have decoupled the controller layer by adding a service layer. At this point the project should be better organized in case future work needs to be done with the classes we have made. By applying a by-feature style of organiztaion we can help readability and maintanability by ourselves and others.</p>

<p>By-feature organization style</p>

<img width="332" height="789" alt="Screenshot 2025-07-28 at 6 01 28 PM" src="https://github.com/user-attachments/assets/8f997b2d-b4d5-4953-b993-b10df6105154" />

<h1>Tests</h1>

<p>By adding guards in the code we can prevent errors. For instance, we can guard against null objects, and we can create tests to see not only if method calls are correct, but if they are being appropriately called singular or multiple times.</p>

<p>Guarding against null</p>

<img width="649" height="190" alt="Screenshot 2025-07-31 at 3 31 35 PM" src="https://github.com/user-attachments/assets/5c1cc272-0f21-4748-afca-e4986a45cf80" />

<p>The POST request confirms the null guard is working and returns our message</p>

<img width="647" height="144" alt="Screenshot 2025-07-28 at 6 36 22 PM" src="https://github.com/user-attachments/assets/250c254e-8229-4c58-a5cb-45b98a75af75" />

<p>Tests involve injecting mock objects and methods in an independant manner separate from the rest of the other classes. We use Mockito to achieve this, which grants us annotations that provide clarity but also this functionality. For instance @BeforeEach will apply the code block before each method, while @AfterEach will apply the code block at the end of each method. Similarly there are annotations for singular useage, etc.</p>

<p>Test with Mocks</p>

<img width="700" height="822" alt="Screenshot 2025-07-31 at 3 17 14 PM" src="https://github.com/user-attachments/assets/269ba052-a76e-46f0-a1d8-717a1d0a5f2f" />

<p>Mockito lets us assert that certain things are the same, such as the original object size should be the same as the new object size, and verify the number of calls.</p>

<p>Assert and verify</p>

<img width="822" height="722" alt="Screenshot 2025-07-31 at 3 17 26 PM" src="https://github.com/user-attachments/assets/6b40eb38-b315-4e9d-98cb-37d32200eeab" />
