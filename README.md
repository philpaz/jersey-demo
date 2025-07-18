- 👋 Hi, I’m @philpaz
- 👀 I’m interested in guitars and motocross.
- 🌱 I’m continously learning.
- 💞️ I’m looking to collaborate on java based projects.
- 📫 How to reach me philip.paz@gmail.com

<!---
philpaz/philpaz is a ✨ special ✨ repository because its `README.md` (this file) appears on your GitHub profile.
You can click the Preview link to take a look at your changes.
--->
Springboot 2.5.5, Jersey eample
Local persistence, private static Map<Integer, User> DB = new HashMap<>(); 
Dockerfile included
Maximum of 1000 users stored in memory; attempts to exceed this limit return HTTP 507.

1. docker build -t springio-demo .

Docker image repository tag convention, before repository push

2. docker tag springio-demo yourDocker/springio-demo:springio-demo

3. docker push yourDocker/springio-demo:springio-demo

POSTMAN

GET localhost:8080/users

POST  localhost:8080/users JSON/RAW
{
    "firstName":"Todd",
    "lastName":"Spanders"
}

DELETE
localhost:8080/users/id
ex: localhost:8080/users/2
