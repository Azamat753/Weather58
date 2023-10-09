package com.example.weather58

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

@Module
@InstallIn(SingletonComponent::class)
class AppModule {
    //https://api.openweathermap.org/data/2.5/weather?lat=42.882004&lon=74.582748&app_id=de871d9a84d8143722b31934ee5d7977

    @Provides
    fun provideApi(): WeatherApi {
        return Retrofit.Builder().baseUrl("https://api.openweathermap.org/")
            .addConverterFactory(GsonConverterFactory.create()).build()
            .create(WeatherApi::class.java)
    }

    @Provides
    fun providePresenter(): Presenter {
        return Presenter(provideApi())
    }

}