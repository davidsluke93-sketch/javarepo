FROM eclipse-temurin:21-jdk-alpine
WORKDIR /app
COPY HighRoller.java .
RUN javac HighRoller.java
CMD ["java", "HighRoller"]
