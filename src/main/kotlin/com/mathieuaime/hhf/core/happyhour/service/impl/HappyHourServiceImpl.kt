package com.mathieuaime.hhf.core.happyhour.service.impl

import com.mathieuaime.hhf.core.happyhour.api.HappyHour
import com.mathieuaime.hhf.core.happyhour.model.HappyHourEntity
import com.mathieuaime.hhf.core.happyhour.repository.HappyHourRepository
import com.mathieuaime.hhf.core.happyhour.service.HappyHourService
import org.springframework.stereotype.Service
import java.time.format.DateTimeFormatter.ISO_TIME
import java.util.*

@Service
class HappyHourServiceImpl(private val happyHourRepository: HappyHourRepository) : HappyHourService {
    override fun findByBarUuid(uuid: String): List<HappyHour> =
            happyHourRepository.findByBarUuid(uuid).map(HappyHourEntity::toApi)

    override fun findByUuidAndBarUuid(uuid: String, barUuid: String): Optional<HappyHour> =
            happyHourRepository.findByUuidAndBarUuid(uuid, barUuid).map(HappyHourEntity::toApi)

}

private fun HappyHourEntity.toApi() =
        HappyHour(uuid, begin.format(ISO_TIME), end.format(ISO_TIME), barUuid)