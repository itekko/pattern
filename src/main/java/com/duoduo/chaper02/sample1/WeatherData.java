package com.duoduo.chaper02.sample1;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject {

    private List<Observer> observers;

    private Data data;

    WeatherData(){
        observers = new ArrayList<>();
        data = new Data();

    }
    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for(Observer observer : observers) observer.update(data);
    }

    public void setData(Data data) {
            this.data = data;
            notifyObservers();
    }

    public Data getData() {
        return data;
    }
}
