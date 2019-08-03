FROM java:8
VOLUME D:/Docker-data/exchange/logs/springcloud-eureka/
ADD springcloud-eureka-1.0-SNAPSHOT.jar app.jar
RUN bash -c 'touch /app.jar'
EXPOSE 8842
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","--spring.profiles.active=local","-jar","/app.jar"]