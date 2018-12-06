package com.duoduo.chaper04.sample1;

public class Client {

    public static void main(String[] args) {
        PizzaStore chicagoPizzaStore = new ChicagoPizzaStore();
        Pizza pizza = chicagoPizzaStore.orderPizza("cheese");
        System.out.println("Ethan orderd a " + pizza.getName() + "\n");

        PizzaStore nyPizzaStore = new NYPizzaStore();
        Pizza pizza2 = nyPizzaStore.orderPizza("cheese");
        System.out.println("Joel orderd a " + pizza2.getName() + "\n");
    }
}
