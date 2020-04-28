package com.mathieuaime.hhf.core.happyhour.repository

import com.mathieuaime.hhf.core.happyhour.model.HappyHourEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import java.util.*

@Repository
interface HappyHourRepository : JpaRepository<HappyHourEntity, String> {
    fun findByBarUuid(uuid: String): List<HappyHourEntity>

    fun findByUuidAndBarUuid(uuid: String, barUuid: String): Optional<HappyHourEntity>
}