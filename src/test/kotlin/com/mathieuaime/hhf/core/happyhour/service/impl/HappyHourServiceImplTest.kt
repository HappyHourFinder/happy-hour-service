package com.mathieuaime.hhf.core.happyhour.service.impl

import com.mathieuaime.hhf.core.happyhour.api.HappyHour
import com.mathieuaime.hhf.core.happyhour.model.HappyHourEntity
import com.mathieuaime.hhf.core.happyhour.repository.HappyHourRepository
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.mockito.InjectMocks
import org.mockito.Mock
import org.mockito.Mockito
import org.mockito.junit.jupiter.MockitoExtension
import java.time.LocalTime
import kotlin.test.assertEquals

@ExtendWith(MockitoExtension::class)
internal class HappyHourServiceImplTest {
    @Mock
    private lateinit var happyHourRepository: HappyHourRepository

    @InjectMocks
    private lateinit var happyHourService: HappyHourServiceImpl

    @Test
    fun findByBarUuid() {
        val uuid = "uuid"
        val happyHourEntity = HappyHourEntity("hh-uuid", LocalTime.of(10, 0), LocalTime.of(12, 0), uuid)

        Mockito.`when`(happyHourRepository.findByBarUuid(uuid)).thenReturn(listOf(happyHourEntity))

        val happyHours = happyHourService.findByBarUuid(uuid)

        val happyHourExpected = HappyHour("hh-uuid", "10:00:00", "12:00:00", uuid)
        assertEquals(listOf(happyHourExpected), happyHours)

        Mockito.verify(happyHourRepository).findByBarUuid(uuid)
    }
}