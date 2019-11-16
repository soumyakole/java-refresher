package com.soumya.concurrency.latch;

public class ShutDownProcessHook implements Runnable {

    @Override
    public void run(){
        System.out.println("Shutdown Hook Called");
    }
}
