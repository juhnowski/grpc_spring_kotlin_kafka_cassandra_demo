FROM openjdk:8-jdk-alpine
EXPOSE 8080
ADD /build/libs/grpc_spring_kotlin_kafka_cassandra_demo-0.0.1-SNAPSHOT.jar grpc_spring_kotlin_kafka_cassandra_demo.jar
ENTRYPOINT ["java", "-jar", "grpc_spring_kotlin_kafka_cassandra_demo.jar"]