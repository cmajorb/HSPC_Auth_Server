FROM maven:3.2-jdk-8
MAINTAINER Major Brown "cmajorb@gmail.com"
COPY . /app
WORKDIR /app
RUN mvn install -DskipTests
WORKDIR reference-auth-server-webapp
CMD mvn jetty:run
