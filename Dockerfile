
FROM eclipse-temurin:21-jdk AS build
WORKDIR /app
COPY HighRoller.java .
RUN javac HighRoller.java


FROM eclipse-temurin:21-jre
WORKDIR /app
COPY --from=build /app/HighRoller.class .
EXPOSE 8080
CMD ["java", "HighRoller"]
