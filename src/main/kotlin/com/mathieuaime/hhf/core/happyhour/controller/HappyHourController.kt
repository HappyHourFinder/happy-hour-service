package com.mathieuaime.hhf.core.happyhour.controller

import com.mathieuaime.hhf.core.happyhour.api.HappyHour
import com.mathieuaime.hhf.core.happyhour.service.HappyHourService
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*

@RequestMapping("/happyhours")
@RestController
class HappyHourController(private val happyHourService: HappyHourService) {
    @GetMapping
    fun findByBarUuid(@RequestParam barUuid: String) = happyHourService.findByBarUuid(barUuid)

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    fun save(@RequestBody happyHour: HappyHour) = happyHourService.save(happyHour)

    @DeleteMapping("/{uuid}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    fun delete(@PathVariable("uuid") uuid: String) = happyHourService.delete(uuid)
}