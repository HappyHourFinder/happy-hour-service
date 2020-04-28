package com.mathieuaime.hhf.core.happyhour.service

import com.mathieuaime.hhf.core.happyhour.api.HappyHour
import java.util.*

interface HappyHourService {
    fun findByBarUuid(uuid: String): List<HappyHour>

    fun findByUuidAndBarUuid(uuid: String, barUuid: String): Optional<HappyHour>
}