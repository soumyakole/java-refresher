package com.soumya.concurrency.latch;

import java.util.concurrent.CountDownLatch;

/**
 * CountDownLatch in Java is a type of synchronizer which allows one Thread to wait for one or more Threads before it starts processing.
 * It is used when we want to wait for more than one thread to complete its task. It is similar to join in threads.
 * But JOIN can not be used in two scenarios:
 *    1. When we use ExecutorService instead of Thread class to create threads.
 *    2. CountDownLatch allow us to modify implementation which can be used to wait for another thread for their partial execution.
 */
public class CountDownLatchExample {

    public static class ProcessThread implements Runnable {
        CountDownLatch latch;
        long workDuration;
        String name;

    public ProcessThread(String name, CountDownLatch latch, long duration) {
        this.name = name;
        this.latch = latch;
        this.workDuration = duration;
    }

    public void run() {
        try {
            System.out.println(name + " Processing Something for " + workDuration / 1000 + " Seconds");
            Thread.sleep(workDuration);
            System.out.printf ("%s completed its task \n", name);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            latch.countDown();
        }
        }
    }

    public static void main(String[] args) {

        CountDownLatch latch = new CountDownLatch(3);



        Thread t1 = new Thread(new ProcessThread("worker_1", latch, 5000));
        Thread t2 = new Thread(new ProcessThread("worker_2", latch, 8000));
        Thread t3 = new Thread(new ProcessThread("worker_2", latch, 600));

        //Shutdown Hook will be called before exit if you terminate the program
        Runtime.getRuntime().addShutdownHook(new Thread(new ShutDownProcessHook()));

        t1.start();
        t2.start();
        t3.start();

        System.out.println(" Waiting for clild process for completion");

        try {
            latch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("All process completed");
        System.out.println("Parent thread can start work now");

    }
}
