FROM eclipse-temurin:21-jdk

WORKDIR /app

COPY HighRoller.java .

RUN javac -d . HighRoller.java

CMD ["java", "game.HighRoller"]
