FROM openjdk:8
ADD target/Hello-0.0.1-SNAPSHOT.jar Hello-0.0.1-SNAPSHOT.jar
EXPOSE 8083
ENTRYPOINT ["java","-jar","Hello-0.0.1-SNAPSHOT.jar"]