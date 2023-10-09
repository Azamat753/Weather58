package com.example.weather58

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Query

interface WeatherApi {
    @GET("data/2.5/weather")
    fun getWeather(
        @Query("lat") lat: Double = 42.882004,
        @Query("lon") lon: Double = 74.582748,
        @Query("appid") key: String = "36cbf21e77603d1848c9293fd5e5ba31",
        @Query("units") units: String = "metric",
//        @Header("app_id") head :String = "36cbf21e77603d1848c9293fd5e5ba31"
    ): Call<WeatherModel>
}