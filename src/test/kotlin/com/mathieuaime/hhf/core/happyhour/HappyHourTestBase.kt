package com.mathieuaime.hhf.core.happyhour

import com.mathieuaime.hhf.core.happyhour.api.HappyHour
import com.mathieuaime.hhf.core.happyhour.controller.HappyHourController
import com.mathieuaime.hhf.core.happyhour.service.HappyHourService
import io.restassured.module.mockmvc.RestAssuredMockMvc
import org.junit.jupiter.api.BeforeEach

abstract class HappyHourTestBase {
    private val happyHourController = HappyHourController(happyHourService())

    @BeforeEach
    fun setup() {
        RestAssuredMockMvc.standaloneSetup(happyHourController)
    }

    private fun happyHourService(): HappyHourService {
        val fakeHappyHour = HappyHour("hh-1", "10:00:00", "11:00:00", "1")
        val fakeHappyHour2 = HappyHour("hh-2", "11:00:00", "12:00:00", "2")
        val happyHours = listOf(fakeHappyHour, fakeHappyHour2)

        return object : HappyHourService {
            override fun findByBarUuid(uuid: String): List<HappyHour> = happyHours.filter { it.barUuid == uuid }

        }
    }
}