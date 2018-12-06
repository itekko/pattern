package com.duoduo.chaper03;

public class DarkRoast extends Beverage {


    public DarkRoast() {
        description = "DarkRoast";
    }

    @Override
    protected Double cost() {
        return 9.9;
    }
}
