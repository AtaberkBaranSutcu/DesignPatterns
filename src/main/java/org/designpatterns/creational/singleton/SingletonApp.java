package org.designpatterns.creational.singleton;

public class SingletonApp {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            Singleton singleton = Singleton.getSingleton();
        }
    }
}
