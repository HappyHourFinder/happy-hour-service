package com.mathieuaime.hhf.core.happyhour.controller

import com.mathieuaime.hhf.core.happyhour.api.HappyHour
import com.mathieuaime.hhf.core.happyhour.service.HappyHourService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RequestMapping("/happyhours")
@RestController
class HappyHourController(private val happyHourService: HappyHourService) {
    @GetMapping
    fun findByBarUuid(@RequestParam barUuid: String): List<HappyHour> = happyHourService.findByBarUuid(barUuid)
}