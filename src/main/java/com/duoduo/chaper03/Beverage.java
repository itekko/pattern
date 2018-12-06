package com.duoduo.chaper03;

public abstract class Beverage {

    protected String description = "Unknown Beverage";


    public String getDescription() {
        return description;
    }

    protected abstract Double cost();

}
