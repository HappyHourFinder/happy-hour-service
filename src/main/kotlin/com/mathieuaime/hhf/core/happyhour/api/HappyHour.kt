package com.mathieuaime.hhf.core.happyhour.api

import java.beans.ConstructorProperties

data class HappyHour @ConstructorProperties("uuid", "begin", "end", "barUuid")
constructor(var uuid: String?, var begin: String, var end: String, var barUuid: String)