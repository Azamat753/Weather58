package com.example.weather58

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.weather58.databinding.ActivityMainBinding
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity(), WeatherView {

    @Inject
    lateinit var presenter: Presenter
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        presenter.attachView(this)
        presenter.getWeather()
        Toast.makeText(this, "Hello", Toast.LENGTH_SHORT).show()
        //push
    }

    override fun showWeather(model: WeatherModel) {
        binding.weatherTv.text =
            "temp: ${model.main.temp} \n humidity: ${model.main.humidity} city: ${model.name}"
    }

    override fun showError(error: String) {
        Toast.makeText(this, error, Toast.LENGTH_SHORT).show()
    }
}