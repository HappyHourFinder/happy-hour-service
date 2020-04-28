package com.mathieuaime.hhf.core.happyhour

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
open class HappyHourServiceApplication

fun main(args: Array<String>) {
    runApplication<HappyHourServiceApplication>(*args)
}