package com.duoduo.chaper03;

public class Mocha extends CodimentDecorator {

    private Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ",Mocha";
    }

    @Override
    protected Double cost() {
        return beverage.cost() + 0.8;
    }
}
