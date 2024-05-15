package com.breezefieldsalesannapurnaswadisht.features.weather.api

import com.breezefieldsalesannapurnaswadisht.features.task.api.TaskApi
import com.breezefieldsalesannapurnaswadisht.features.task.api.TaskRepo

object WeatherRepoProvider {
    fun weatherRepoProvider(): WeatherRepo {
        return WeatherRepo(WeatherApi.create())
    }
}