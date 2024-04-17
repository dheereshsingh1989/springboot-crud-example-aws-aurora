# Define a base image
FROM openjdk:11

EXPOSE 8090

# Copy the jar into docker container linux virtual machine/docker engine
COPY target/users-mysql.jar users-mysql.jar

# CMD command used to execute the app inside the container
CMD java -jar users-mysql.jar






