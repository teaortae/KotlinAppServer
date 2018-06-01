package com.test

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
open class KotlinAppServerApplication

fun main(args: Array<String>) {
    SpringApplication.run(KotlinAppServerApplication::class.java, *args)
}
