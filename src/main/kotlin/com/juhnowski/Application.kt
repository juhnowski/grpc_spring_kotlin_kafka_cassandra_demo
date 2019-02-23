package com.juhnowski

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cloud.stream.annotation.EnableBinding
import org.springframework.kafka.annotation.EnableKafka
import org.springframework.cloud.stream.messaging.Source

@SpringBootApplication
@EnableKafka
@EnableBinding( Source::class)
class Application

fun main(args: Array<String>) {
    SpringApplication.run(Application::class.java, *args)
}