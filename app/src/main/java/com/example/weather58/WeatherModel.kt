package com.example.weather58

//{
//    "coord": {
//        "lon": 74.5827,
//        "lat": 42.882
//    },
//    "weather": [
//        {
//            "id": 801,
//            "main": "Clouds",
//            "description": "few clouds",
//            "icon": "02d"
//        }
//    ],
//    "base": "stations",
//    "main": {
//        "temp": 293.43,
//        "feels_like": 292.4,
//        "temp_min": 293.43,
//        "temp_max": 293.43,
//        "pressure": 1018,
//        "humidity": 34,
//        "sea_level": 1018,
//        "grnd_level": 935
//    },
//    "visibility": 10000,
//    "wind": {
//        "speed": 1.7,
//        "deg": 307,
//        "gust": 1.89
//    },
//    "clouds": {
//        "all": 20
//    },
//    "dt": 1696854429,
//    "sys": {
//        "type": 1,
//        "id": 8871,
//        "country": "KG",
//        "sunrise": 1696813622,
//        "sunset": 1696854654
//    },
//    "timezone": 21600,
//    "id": 1528675,
//    "name": "Bishkek",
//    "cod": 200
//}
data class WeatherModel(
    var weatherList: List<WeatherDescriptionModel>,
    var main: TempModel,
    var wind: WindModel,
    var name: String
)

data class WindModel(
    var speed: Double
)

data class TempModel(
    var temp: Double,
    var pressure: Int,
    var humidity: Int
)


data class WeatherDescriptionModel(
    var main: String,
    var description: String,
)
