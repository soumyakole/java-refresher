package com.soumya.lambda;

public class TestFuncInterface {
    public static void main(String[] args) {
        FunctionalInterface1 s = (int i) -> i*i;
        System.out.println(s.calculate(10));
        System.out.println(System.getProperty("PATH"));
        System.out.printf(System.getenv("PATH"));
    }
}
