**This project is about learning to use SpringBoot and learning the annotations and opinionated style.**

<H1>SPRING BEANS & DEPENDENCY INJECTION</H1>

* What is a bean
* How to make a project a springboot project
* different dependency injection in Spring, such as the preferred constructor injection, but also setter injection and field injection.

<img width="705" alt="Screenshot 2024-12-16 at 4 15 42 PM" src="https://github.com/user-attachments/assets/d5353cea-08e1-4846-8be5-845609e15f7f" />
<img width="705" alt="Screenshot 2024-12-16 at 4 15 42 PM" src="https://github.com/user-attachments/assets/9305a613-ba32-487a-ae3b-b05321adb423" />
<img width="539" alt="Screenshot 2024-12-16 at 4 15 31 PM" src="https://github.com/user-attachments/assets/9723f819-f7ad-4d73-b936-ff2284ad160e" />
<img width="801" alt="Screenshot 2024-12-16 at 4 15 22 PM" src="https://github.com/user-attachments/assets/4e26c93d-be49-4c18-9d79-d248cf73eaa8" />

<H1>SPRING PROFILES</H1>

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

<H1>HTTP METHODS</H1>
* GET POST PUT DELETE PATCH OPTIONS HEAD
* 1XX 2XX 3XX 4XX 5XX -> Informational, Success, Redirection, Client Error, Server Error
* 200 OK, 201 Created, 204 No Content, 
* 400 Bad Request, 401 Unauthorized, 403 Forbidden, 404 Not Found, 405 Method Not Allowed, 
* 500 Internal Server Error

<H1>SPRING REST</H1>