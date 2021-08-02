FROM openjdk:8-jdk-alpine
VOLUME /tmp
COPY ./target/library-books-0.1.0.jar app.jar
RUN apk add --no-cache bash
ENTRYPOINT ["java","-jar","/app.jar"]