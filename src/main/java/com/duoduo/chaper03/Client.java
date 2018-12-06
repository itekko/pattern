package com.duoduo.chaper03;

public class Client {

    public static void main(String[] args) {
        Beverage houseBlend = new HouseBlend();
        Beverage milk = new Milk(houseBlend);
        Beverage mocha = new Mocha(milk);
        System.out.println(mocha.cost());
        System.out.println(mocha.getDescription());

    }
}
