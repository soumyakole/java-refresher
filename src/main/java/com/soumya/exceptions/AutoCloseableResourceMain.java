package com.soumya.exceptions;

public class AutoCloseableResourceMain {
    public static void main(String[] args){
        try(AutoCloseableResource aR = new AutoCloseableResource()){
            int i = 1/0;
            aR.doSomething(); // this method will never be called, but the resource will be closed.
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
