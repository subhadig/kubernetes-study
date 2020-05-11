FROM openjdk:8-alpine
MAINTAINER subhadig@github
COPY target/simple-web-service-*.0.1-SNAPSHOT.jar /opt/app.jar
ENTRYPOINT ["/usr/bin/java", "-jar", "/opt/app.jar"]
EXPOSE 8080
