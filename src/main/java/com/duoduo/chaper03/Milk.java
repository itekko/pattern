package com.duoduo.chaper03;

public class Milk extends CodimentDecorator {

    private Beverage beverage;


    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    protected Double cost() {

        return beverage.cost() + 0.9;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ",Milk";
    }
}
