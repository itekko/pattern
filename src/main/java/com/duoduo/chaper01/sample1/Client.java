package com.duoduo.chaper01.sample1;

import java.util.ArrayList;
import java.util.List;

public class Client {

    public static void main(String[] args) {
        Duck decoyDuck = new DecoyDuck();
        Duck mallardDuck = new MallardDuck();
        Duck rebberDuck = new RebberDuck();
        Duck redheadDuck = new RebberDuck();
        List<Duck> list = new ArrayList<>();
        list.add(decoyDuck);
        list.add(mallardDuck);
        list.add(rebberDuck);
        list.add(redheadDuck);
        for (Duck duck: list) {
            duck.display();
            duck.swim();
            if(duck instanceof Flyable) ((Flyable) duck).fly();
            if(duck instanceof Quackable)((Quackable) duck).quack();
        }
    }
}
