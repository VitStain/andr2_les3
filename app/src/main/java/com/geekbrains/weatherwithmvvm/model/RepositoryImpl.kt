package com.geekbrains.weatherwithmvvm.model

import com.geekbrains.weatherwithmvvm.model.entities.Weather
import com.geekbrains.weatherwithmvvm.model.entities.getRussianCities
import com.geekbrains.weatherwithmvvm.model.entities.getWorldCities

class RepositoryImpl : Repository {
    override fun getWeatherFromServer() = Weather()
    override fun getWeatherFromLocalStorageRus() = getRussianCities()
    override fun getWeatherFromLocalStorageWorld() = getWorldCities()
}