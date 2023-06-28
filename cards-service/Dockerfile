FROM eclipse-temurin:17-jammy

WORKDIR /app

COPY target/micro-cards.jar /app/micro-cards.jar

EXPOSE 9093

CMD ["java", "-jar", "/app/micro-cards.jar"]
