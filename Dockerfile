FROM adoptopenjdk/openjdk16:alpine-slim

ENV USER="nobody"

USER $USER

ARG JAR_FILE=target/*.jar

COPY ${JAR_FILE} app.jar

EXPOSE 8080

ENTRYPOINT ["java","-jar","/app.jar"]
