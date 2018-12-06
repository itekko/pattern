package com.duoduo.chaper03;

public class Soy extends CodimentDecorator {

    private Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ",Soy";
    }

    @Override
    protected Double cost() {
        return beverage.cost() + 0.7;
    }
}
