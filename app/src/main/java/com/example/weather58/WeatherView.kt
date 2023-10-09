package com.example.weather58

interface WeatherView {

    fun showWeather(model: WeatherModel)
    fun showError(error:String)
}