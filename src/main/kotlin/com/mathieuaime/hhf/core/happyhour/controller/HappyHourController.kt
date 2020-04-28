package com.mathieuaime.hhf.core.happyhour.controller

import com.mathieuaime.hhf.core.happyhour.service.HappyHourService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RequestMapping("/happyhours")
@RestController
class HappyHourController(private val happyHourService: HappyHourService) {
    @GetMapping
    fun findByBarUuid(@RequestParam barUuid: String) = happyHourService.findByBarUuid(barUuid)

    @GetMapping("/{uuid}")
    fun findByBarUuid(@PathVariable("uuid") uuid: String, @RequestParam barUuid: String) =
            ResponseEntity.of(happyHourService.findByUuidAndBarUuid(uuid, barUuid))
}