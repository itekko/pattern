package com.duoduo.chaper02.sample1;

public class CurrentConditionDisplay implements Observer,DisplayElement {

    private Subject weatherData;
    public CurrentConditionDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display(Data data) {
        System.out.println(data);
    }

    @Override
    public void update(Data data) {
        display(data);
    }


}
