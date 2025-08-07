FROM openjdk:17
## move jar file which build by jenkins into docker
COPY target/spring-boot-sw-arcademy-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java", "-jar", "/app.jar"]