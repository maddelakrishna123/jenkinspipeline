FROM openjdk:8
EXPOSE 8081
ADD target/employeeservices.jar employeeservices.jar
ENTRYPOINT ["java","-jar","employeeservices.jar"]