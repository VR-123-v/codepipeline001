FROM openjdk:17-jdk-slim
WORKDIR /app
COPY target/codepipeline-0.0.1-SNAPSHOT.jar springboot-aws-codepipeline001.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","springboot-aws-codepipeline001.jar"]
