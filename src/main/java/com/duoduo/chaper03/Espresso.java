package com.duoduo.chaper03;

public class Espresso extends Beverage {

    public Espresso(){
    description = "Espresso";
    }

    @Override
    protected Double cost() {
        return 8.9;
    }
}
