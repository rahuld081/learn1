FROM openjdk:8
MAINTAINER rahul
EXPOSE 8081
ARG JAR_FILE=/home/eco-mail/git/learn1/learn11/target/learn11-0.0.1-SNAPSHOT.jar
RUN mkdir -pv /home/eco-mail/rahul/test
ADD ${JAR_FILE} /home/eco-mail/rahul/test/learn1.jar
ENTRYPOINT ["java","-jar","/home/eco-mail/rahul/test/learn1.jar"]
