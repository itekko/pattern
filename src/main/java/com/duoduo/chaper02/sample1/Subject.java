package com.duoduo.chaper02.sample1;

public interface Subject {


    void registerObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObservers();


}
