- š Hi, Iām @philpaz
- š Iām interested in guitars and motocross.
- š± Iām continously learning.
- šļø Iām looking to collaborate on java based projects.
- š« How to reach me philip.paz@gmail.com

<!---
philpaz/philpaz is a āØ special āØ repository because its `README.md` (this file) appears on your GitHub profile.
You can click the Preview link to take a look at your changes.
--->
Springboot 2.5.5, Jersey eample
Local persistence, private static Map<Integer, User> DB = new HashMap<>(); 
Dockerfile included

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
