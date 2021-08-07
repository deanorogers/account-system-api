FROM openjdk:8-jdk-alpine
VOLUME /tmp
COPY ./target/account-system-api-0.0.1-SNAPSHOT.jar app.jar
RUN apk add --no-cache bash
ENTRYPOINT ["java","-jar","/app.jar"]