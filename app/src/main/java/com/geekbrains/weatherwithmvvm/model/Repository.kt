package com.geekbrains.weatherwithmvvm.model

import com.geekbrains.weatherwithmvvm.model.entities.Weather

interface Repository {
    fun getWeatherFromServer(): Weather
    fun getWeatherFromLocalStorageRus(): List<Weather>
    fun getWeatherFromLocalStorageWorld(): List<Weather>
}