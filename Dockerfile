FROM openjdk:17-jdk-slim
WORKDIR /apps
COPY target/demo-0.0.1-SNAPSHOT.jar new1.jar
EXPOSE 8084
ENTRYPOINT ["java","-jar","new1.jar"]