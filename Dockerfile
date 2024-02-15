FROM openjdk:11-alpine
VOLUME /tmp
COPY target/docker-microservices-0.0.1-SNAPSHOT.jar ecs-docker-microservices.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/ecs-docker-microservices.jar"]