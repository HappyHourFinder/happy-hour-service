package com.mathieuaime.hhf.core.happyhour

import io.swagger.v3.oas.annotations.OpenAPIDefinition
import io.swagger.v3.oas.annotations.info.Info
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.client.discovery.EnableDiscoveryClient

@SpringBootApplication
@EnableDiscoveryClient
@OpenAPIDefinition(info = Info(title = "Happy Hour API", version = "1.0", description = "Documentation Happy Hour API v1.0"))
open class HappyHourServiceApplication

fun main(args: Array<String>) {
    runApplication<HappyHourServiceApplication>(*args)
}