# spring-restapi-demo

This repo about using Spring Boot to create restful api. It is coded according to "Building REST services with Spring" guide. 
Full link can be found at https://spring.io/guides/tutorials/rest/


To build a docker image, run the following at the project directory
./mvnw spring-boot:build-image

To run the application in the container

docker run -it -p 9001:8080  restapi2:0.0.1-SNAPSHOT

