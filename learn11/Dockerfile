FROM openjdk:8
MAINTAINER rahul
ARG JAR_FILE=target/learn11-0.0.1-SNAPSHOT.jar
RUN mkdir -pv /home/eco-mail/rahul/test && cd /home/eco-mail/rahul/test
COPY "${JAR_FILE}" /home/eco-mail/rahul/test/learn1.jar
ENTRYPOINT ["java","-jar","/home/eco-mail/rahul/test/learn1.jar"]
