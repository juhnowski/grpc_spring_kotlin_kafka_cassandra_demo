package com.juhnowski.tables

import org.springframework.data.cassandra.core.mapping.PrimaryKey
import org.springframework.data.cassandra.core.mapping.Table


@Table("greetings")
data class Greetings (
    @PrimaryKey
    val id: Long=1,
    val name:String="",
    var content:String=""
)