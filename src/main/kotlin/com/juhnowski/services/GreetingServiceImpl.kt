package com.juhnowski.services

import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import com.juhnowski.entities.Greeting
import com.juhnowski.repositories.GreetingsRepository
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.cloud.stream.annotation.StreamListener
import org.springframework.stereotype.Service
import org.springframework.cloud.stream.messaging.Source
import org.springframework.messaging.MessageHeaders
import org.springframework.messaging.support.MessageBuilder.createMessage

@Service
open class GreetingServiceImpl: GreetingService {
    val JSON = jacksonObjectMapper()

    private val logger = LoggerFactory.getLogger(GreetingService::class.java)

    @Autowired
    lateinit var output: Source

    @Autowired
    lateinit var greetingsRepository: GreetingsRepository

    override fun sendGreeting(data: Greeting) {
        val greet = data

        greetingsRepository.save(data)
        logger.info("Greeting saved: " + data)

        val dataString = JSON.writeValueAsString(greet)


        val map =
            hashMapOf(org.springframework.messaging.MessageHeaders.CONTENT_TYPE to "application/octet-stream") as Map<String, Any>

        val datatByte = JSON.writeValueAsBytes(dataString)

        val msg = createMessage(datatByte, MessageHeaders(map))

        output.output().send(msg)
        logger.info("Greeting received: " + msg)
    }

}