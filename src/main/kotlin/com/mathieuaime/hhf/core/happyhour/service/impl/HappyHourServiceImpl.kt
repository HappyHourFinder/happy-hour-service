package com.mathieuaime.hhf.core.happyhour.service.impl

import com.mathieuaime.hhf.core.happyhour.api.HappyHour
import com.mathieuaime.hhf.core.happyhour.model.HappyHourEntity
import com.mathieuaime.hhf.core.happyhour.repository.HappyHourRepository
import com.mathieuaime.hhf.core.happyhour.service.HappyHourService
import org.springframework.stereotype.Service
import java.time.LocalTime.parse
import java.time.format.DateTimeFormatter.ISO_TIME
import java.util.UUID.randomUUID

@Service
internal class HappyHourServiceImpl(private val happyHourRepository: HappyHourRepository) : HappyHourService {
    override fun findByBarUuid(uuid: String): List<HappyHour> =
            happyHourRepository.findByBarUuid(uuid).map(HappyHourEntity::toApi)

    override fun save(happyHour: HappyHour): HappyHour =
            happyHourRepository.save(happyHour.toEntity()).toApi()

    override fun delete(uuid: String) =
            happyHourRepository.findById(uuid).ifPresent(happyHourRepository::delete)
}

private fun HappyHourEntity.toApi() =
        HappyHour(uuid, beginTime.format(ISO_TIME), endTime.format(ISO_TIME), barUuid)

private fun HappyHour.toEntity() =
        HappyHourEntity(uuid ?: randomUUID().toString(), parse(begin), parse(end), barUuid)