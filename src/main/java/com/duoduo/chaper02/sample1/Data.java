package com.duoduo.chaper02.sample1;

public class Data {

    private Double temperature;

    private Double humidity;

    private Double presssure;

    public Double getTemperature() {
        return temperature;
    }

    public void setTemperature(Double temperature) {
        this.temperature = temperature;
    }

    public Double getHumidity() {
        return humidity;
    }

    public void setHumidity(Double humidity) {
        this.humidity = humidity;
    }

    public Double getPresssure() {
        return presssure;
    }

    public void setPresssure(Double presssure) {
        this.presssure = presssure;
    }

    @Override
    public boolean equals(Object obj) {
        Data data = (Data) obj;
        if(this.humidity == data.humidity &&
                this.presssure == data.presssure &&
                this.temperature == data.temperature) return true;
        return false;

    }

    @Override
    public String toString() {
        return "Data{" +
                "temperature=" + temperature +
                ", humidity=" + humidity +
                ", presssure=" + presssure +
                '}';
    }
}
