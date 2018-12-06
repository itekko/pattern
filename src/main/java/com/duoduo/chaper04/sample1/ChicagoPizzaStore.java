package com.duoduo.chaper04.sample1;

public class ChicagoPizzaStore extends PizzaStore {


    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza = null;
        switch (type){
            case "cheese":{
                pizza = new ChicagoStyleCheesePizza();
                break;
            }

        }
        return pizza;
    }
}
