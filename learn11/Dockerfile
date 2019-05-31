FROM Openjdk:8-jre
MAINTAINER rahul
EXPOSE 8085
RUN mkdir -pv /home/eco-mail/distributor/
ARG JAR_FILE=/target/learn11-0.0.1-SNAPSHOT.jar
ADD ${JAR_FILE} /home/eco-mail/distributor/learn.jar
ENTRYPOINT ["java","-jar","/home/eco-mail/distributor/learn.jar"]