package com.breezefieldsalesannapurnaswadisht.features.weather.api

import com.breezefieldsalesannapurnaswadisht.base.BaseResponse
import com.breezefieldsalesannapurnaswadisht.features.task.api.TaskApi
import com.breezefieldsalesannapurnaswadisht.features.task.model.AddTaskInputModel
import com.breezefieldsalesannapurnaswadisht.features.weather.model.ForeCastAPIResponse
import com.breezefieldsalesannapurnaswadisht.features.weather.model.WeatherAPIResponse
import io.reactivex.Observable

class WeatherRepo(val apiService: WeatherApi) {
    fun getCurrentWeather(zipCode: String): Observable<WeatherAPIResponse> {
        return apiService.getTodayWeather(zipCode)
    }

    fun getWeatherForecast(zipCode: String): Observable<ForeCastAPIResponse> {
        return apiService.getForecast(zipCode)
    }
}