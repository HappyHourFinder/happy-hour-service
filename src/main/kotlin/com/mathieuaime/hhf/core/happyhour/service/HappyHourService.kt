package com.mathieuaime.hhf.core.happyhour.service

import com.mathieuaime.hhf.core.happyhour.api.HappyHour

interface HappyHourService {
    fun findByBarUuid(uuid: String): List<HappyHour>

    fun save(happyHour: HappyHour): HappyHour

    fun delete(uuid: String)
}