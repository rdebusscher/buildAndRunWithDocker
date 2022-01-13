#
# Build stage
#
FROM maven:3.6.0-jdk-11-slim AS build
COPY src /home/app/src
COPY pom.xml /home/app
RUN mvn -f /home/app/pom.xml clean package

#
# Package stage
#
FROM payara/micro:5.2021.10-jdk11
COPY --from=build /home/app/target/hello.war ${DEPLOY_DIR}
