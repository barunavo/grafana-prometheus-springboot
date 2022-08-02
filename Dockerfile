FROM maven:3.5.2-jdk-8-alpine
ADD . /app
WORKDIR /app
RUN mvn clean package -DskipTests=true
CMD mvn spring-boot:run
