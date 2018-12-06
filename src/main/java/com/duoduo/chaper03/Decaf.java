package com.duoduo.chaper03;

public class Decaf extends Beverage {

    public Decaf(){
        description = "Decaf";
    }

    @Override
    protected Double cost() {
        return 20.0;
    }
}
