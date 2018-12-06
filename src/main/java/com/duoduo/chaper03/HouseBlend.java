package com.duoduo.chaper03;

public class HouseBlend extends Beverage {

    public HouseBlend() {
        description = "HouseBlend";
    }

    @Override
    protected Double cost() {
        return 10.9;
    }
}
