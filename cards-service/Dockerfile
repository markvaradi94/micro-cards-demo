FROM eclipse-temurin:17-jammy

COPY wait-for-it.sh /wait-for-it.sh

RUN chmod +x /wait-for-it.sh

WORKDIR /app

COPY target/micro-cards.jar /app/micro-cards.jar

EXPOSE 9093

CMD /wait-for-it.sh config-server:8071 -- java -jar /app/micro-cards.jar
