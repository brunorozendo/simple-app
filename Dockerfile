FROM docker.io/library/openjdk:17-alpine
COPY service/build/libs/service-1.0-SNAPSHOT.jar /vovoMafalda.jar
EXPOSE 8080
CMD ["java", "-jar", "/vovoMafalda.jar"]