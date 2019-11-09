package com.soumya.singleton;

public class SingletonMain {
    public static void main(String[] args) {
        Singleton s = Singleton.getInstance();
        s.getTime();
        Singleton s1 = Singleton.getInstance();
        s.getTime();
        System.out.println(s1 == s);
        System.out.println(s1.equals(s));
        System.out.println(s);
        System.out.println(s1);
    }
}
