package com.juhnowski.services

import com.juhnowski.entities.Greeting

interface GreetingService{
    fun sendGreeting(data: Greeting)
}