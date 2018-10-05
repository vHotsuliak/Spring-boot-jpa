FROM openjdk:8
ADD target/Spring-boot-jpa-0.0.1-SNAPSHOT.jar Spring-boot-jpa-0.0.1-SNAPSHOT.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "Spring-boot-jpa-0.0.1-SNAPSHOT.jar"]
