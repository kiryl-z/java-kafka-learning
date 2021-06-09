FROM adoptopenjdk/openjdk16:alpine-slim

ENV USER="nobody"

USER $USER

ARG JAR_FILE=target/*.jar

COPY ${JAR_FILE} app.jar

ENTRYPOINT ["java","-jar","/app.jar"]
