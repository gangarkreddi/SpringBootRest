FROM openjdk:11
COPY target/raghava-0.0.1-SNAPSHOT.jar raghava-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "/raghava-0.0.1-SNAPSHOT.jar"]