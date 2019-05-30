FROM openjdk:8
MAINTAINER rahul
ARG JAR_FILE=target/learn11-0.0.1-SNAPSHOT.jar
EXPOSE 8081
RUN mkdir -pv /home/eco-mail/rahul/test1 && cd /home/eco-mail/rahul/test1
ADD ${JAR_FILE} /home/eco-mail/rahul/test1/learn.jar
ENTRYPOINT ["java","-jar","/home/eco-mail/rahul/test1/learn1.jar"]
