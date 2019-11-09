package com.soumya.singleton;

import java.time.LocalTime;

public class Singleton{
    private Singleton() {}
    public void getTime(){
        System.out.println("Time is :" + LocalTime.now());
    }
    private static class SingletonHolder {
        public static final Singleton instance = new Singleton();
    }
    public static Singleton getInstance() {
        return SingletonHolder.instance;
    }
    }