# ── Etapa 1: build ──────────────────────────────────────
FROM maven:3.9-eclipse-temurin-21-alpine AS build
WORKDIR /app

COPY pom.xml .
RUN mvn dependency:go-offline -B --no-transfer-progress

COPY src ./src
RUN mvn clean package -DskipTests -B --no-transfer-progress

# ── Etapa 2: runtime ────────────────────────────────────
FROM eclipse-temurin:21-jre-alpine
WORKDIR /app

RUN addgroup -S codeflow && adduser -S codeflow -G codeflow
USER codeflow

COPY --from=build /app/target/*.jar app.jar

EXPOSE 3010
ENTRYPOINT ["java", "-jar", "app.jar"]