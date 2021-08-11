FROM openjdk:8-jdk-alpine
VOLUME /tmp
COPY ./target/account-system-api-0.0.1-SNAPSHOT.jar /app/app.jar
WORKDIR /app
RUN apk add --no-cache bash
ENTRYPOINT ["java","-jar","/app/app.jar"]