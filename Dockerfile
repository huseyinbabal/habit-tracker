FROM maven:3-amazoncorretto-21 as build
WORKDIR /usr/src/app
COPY . .
RUN mvn clean package

FROM amazoncorretto:21-alpine3.16-jdk
COPY --from=build /usr/src/app/target/habit-tracker-v2*.jar /app.jar
ENTRYPOINT ["java","-jar","/app.jar"]


