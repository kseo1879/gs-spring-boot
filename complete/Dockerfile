FROM adoptopenjdk/openjdk8
ENV	SPRING_PROFILES_ACTIVE=dev
COPY build/libs/*.jar hello.jar
ENTRYPOINT ["java","-jar","/hello.jar"]
EXPOSE 8080