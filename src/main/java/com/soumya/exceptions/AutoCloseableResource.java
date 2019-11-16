package com.soumya.exceptions;

public class AutoCloseableResource implements AutoCloseable {

    public AutoCloseableResource() {
        System.out.println("New AutoCloseableResource has been created");
    }

    public void doSomething() {
        System.out.println("Do something in AutoCloseableResource");
    }

    @Override
    public void close() throws Exception {
        System.out.println("Closed AutoCloseableResource");
    }
}