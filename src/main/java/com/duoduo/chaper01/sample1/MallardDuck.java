package com.duoduo.chaper01.sample1;

public class MallardDuck extends Duck implements Flyable,Quackable {

    @Override
    protected void swim() {
        System.out.println("MallardDuck is swimming");
    }

    @Override
    void display() {
        System.out.println("this is mallard duck");
    }

    @Override
    public void fly() {
        System.out.println("MallardDuck can fly in the sky");
    }

    @Override
    public void quack() {
        System.out.println("MallardDuck is quacking");
    }
}
