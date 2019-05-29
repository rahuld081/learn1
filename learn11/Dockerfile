FROM openjdk:8
MAINTAINER rahul
ARG JAR_FILE=target/learn11-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} ./learn11.jar
EXPOSE 8081
ENTRYPOINT ["java","-jar","./learn11.jar"]