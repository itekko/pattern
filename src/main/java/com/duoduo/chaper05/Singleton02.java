package com.duoduo.chaper05;

public class Singleton02 {

    private static Singleton02 instance = new Singleton02();

    private Singleton02(){}

    public static Singleton02 getInstance(){
        return instance;
    }
}
