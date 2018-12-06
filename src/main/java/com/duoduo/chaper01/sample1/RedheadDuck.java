package com.duoduo.chaper01.sample1;

public class RedheadDuck extends Duck implements Flyable,Quackable {

    @Override
    protected void swim() {
        System.out.println("RedheadDuck is swimming");
    }

    @Override
    void display() {
        System.out.println("this is red head duck");
    }

    @Override
    public void fly() {
        System.out.println("RedheadDuck can fly in the sky");
    }

    @Override
    public void quack() {
        System.out.println("RedheadDuck is quacking");
    }
}
