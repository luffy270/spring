FROM java:8-alpine
VOLUME /tmp
ADD target/spring-cloud-eureka-config-0.0.1-SNAPSHOT.jar app.jar
RUN sh -c  'touch /app.jar'
EXPOSE 8888 
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]

