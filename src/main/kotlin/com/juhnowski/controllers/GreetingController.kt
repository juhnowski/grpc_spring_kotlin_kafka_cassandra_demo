package com.juhnowski.controllers

import com.juhnowski.services.GreetingService
import com.juhnowski.entities.Greeting
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*
import java.util.concurrent.atomic.AtomicLong

@RestController
class GreetingController {

    @Autowired
    lateinit var greetingService: GreetingService

    val counter = AtomicLong()
    @GetMapping("/greeting")
    fun greeting(@RequestParam(value = "name", defaultValue = "World") name: String) =
        Greeting(counter.incrementAndGet(), name, "Hello, $name")

    @PostMapping("/greeting1")
    fun greeting1(@RequestBody greetMsg: Greeting): Greeting {
        greetingService.sendGreeting(greetMsg)
        return greetMsg
    }
}