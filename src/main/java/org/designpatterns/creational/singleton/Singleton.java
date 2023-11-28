package org.designpatterns.creational.singleton;

public class Singleton {

    private static Singleton singleton;

    private static int count = 0;

    private Singleton() {
        System.out.println("Created: new Singleton()");
    }

    /**
     * Double-checked locking
     * Lazy loading
     * Thread safe
     * Maximum performance
     */
    public static Singleton getSingleton() {
        if (singleton == null) {
            synchronized (Singleton.class) {
                if (singleton == null) {
                    singleton = new Singleton();
                }
            }
        }
        System.out.println(++count);
        return singleton;
    }
}
