package com.duoduo.chaper02.sample1;

public class Client {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherData);
        Data data = weatherData.getData();
        data.setHumidity(20.12);
        data.setPresssure(20.1);
        data.setTemperature(15.8);
        weatherData.setData(data);
    }
}
