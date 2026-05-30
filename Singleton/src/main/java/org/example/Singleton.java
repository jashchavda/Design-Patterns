package org.example;

public class Singleton {

    private static Singleton instance = new Singleton();

    private Singleton() {
        System.out.println("Singleton Object Created");
    }

    public static Singleton getInstance() {
        return instance;
    }


}
