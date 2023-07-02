FROM amazoncorretto:11-alpine-jdk
MAINTAINER HERNAN
COPY target/iq-backend-0.0.1-SNAPSHOT.jar iquantum-app.jar
ENTRYPOINT ["java","-jar","/iquantum-app.jar"]