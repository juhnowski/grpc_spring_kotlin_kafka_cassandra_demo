package com.juhnowski.repositories

import com.juhnowski.entities.Greeting
import org.springframework.data.cassandra.repository.CassandraRepository
import org.springframework.stereotype.Repository


@Repository
interface GreetingsRepository:   CassandraRepository<Greeting,Int> {
    fun findByName(name: String): MutableList<Greeting>
}