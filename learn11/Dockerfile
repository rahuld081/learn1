FROM openjdk:8
MAINTAINER rahul
ARG JAR_FILE=./learn11/target/learn11-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} /home/eco-mail/rahul/test1/learn11.jar
EXPOSE 8081
ENTRYPOINT ["java","-jar","/home/eco-mail/rahul/test1/learn11.jar"]