# Test Juhnowski Ilya

## Запуск сервис
./gradlew bootRun

## Запуск Kafka
docker run -p 2181:2181 -p 9092:9092 --env ADVERTISED_HOST=localhost --env ADVERTISED_PORT=9092 spotify/kafka

## Порт
Сменить порт сервиса можно в файле src/main/resources/application.properties

## Тест-1
URL: http://localhost:8090/greeting

## Тест-2
ARC или Postman
- Headers: Content-Type application/json
- URL: http://localhost:8090/greeting1
- Body: {"id":"1",  "content":"Hello Kafka"}

В консоле будет лог:
![alt text](kafka_log.png)

В ARC придет 200 ОК
![alt text](arc_log.png)

## Построить из исходников
-  git clone https://github.com/juhnowski/grpc_spring_kotlin_kafka_cassandra_demo.git
- cd grpc_spring_kotlin_kafka_cassandra_demo/
- ./gradlew build
- ./gradlew bootJar
- docker build . -t grpc_spring_kotlin_kafka_cassandra_demo
- docker push juhnowski/grpc_spring_kotlin_kafka_cassandra_demo

## Docker
- docker -v
- docker stats
- docker pull juhnowski/grpc_spring_kotlin_kafka_cassandra_demo
- docker run -p 8090:8090 juhnowski/grpc_spring_kotlin_kafka_cassandra_demo:latest

## Cassandra
docker run --name demo-cassandra -d cassandra:latest

