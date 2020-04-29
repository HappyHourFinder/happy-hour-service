package com.mathieuaime.hhf.core.happyhour

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.client.discovery.EnableDiscoveryClient

@SpringBootApplication
@EnableDiscoveryClient
open class HappyHourServiceApplication

fun main(args: Array<String>) {
    runApplication<HappyHourServiceApplication>(*args)
}