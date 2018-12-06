package com.duoduo.chaper01.sample1;

public class RebberDuck extends Duck implements Quackable {

    @Override
    protected void swim() {
        System.out.println("RebberDuck is swimming");
    }

    @Override
    void display() {
        System.out.println("this is rebber duck");
    }

    @Override
    public void quack() {
        System.out.println("reberDuck is quacking");
    }
}
