package com.example.weather58

import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import javax.inject.Inject

class Presenter @Inject constructor(private val api: WeatherApi) {

    private lateinit var view: WeatherView

    fun getWeather() {
        api.getWeather().enqueue(object : Callback<WeatherModel> {
            override fun onResponse(call: Call<WeatherModel>, response: Response<WeatherModel>) {
                response.body()?.let {
                    view.showWeather(it)
                }
            }

            override fun onFailure(call: Call<WeatherModel>, t: Throwable) {
                view.showError(t.message.toString())
            }
        })
    }

    fun attachView(view: WeatherView) {
        this.view = view
    }

}