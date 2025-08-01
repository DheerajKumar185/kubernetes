FROM openjdk:17
EXPOSE 8080
ADD target/spring-boot-docker-k8s.jar spring-boot-docker-k8s.jar
ENTRYPOINT ["java", "-jar", "/spring-boot-docker-k8s.jar"]