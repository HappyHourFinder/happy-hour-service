package com.mathieuaime.hhf.core.happyhour.model

import java.time.LocalTime
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
data class HappyHourEntity(
        @Id
        @GeneratedValue
        val uuid: String,
        @Column(nullable = false)
        val beginTime: LocalTime,
        @Column(nullable = false)
        val endTime: LocalTime,
        @Column(nullable = false)
        val barUuid: String
)
