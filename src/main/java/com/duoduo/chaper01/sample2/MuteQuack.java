package com.duoduo.chaper01.sample2;

public class MuteQuack implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("<<Silence >>");
    }
}
