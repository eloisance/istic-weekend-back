FROM openjdk:8-jdk-alpine
VOLUME /tmp
EXPOSE 8080
ADD target/project.weekend-1.0.0.RELEASE.jar app.jar
ENV JAVA_OPTS=""
ENTRYPOINT exec java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -Dspring.profiles.active=container -jar /app.jar