package com.soumya.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class TestFuncInterface {
    public static void process (Runnable r){
        r.run();
    }
    public static void main(String[] args) {
        FunctionalInterface1 s = (int i) -> i*i;
        System.out.println(s.calculate(10));
        System.out.println(System.getProperty("PATH"));
        System.out.printf(System.getenv("PATH"));

        //ArrayList<Integer> intArray= new ArrayList<>(10);
        //intArray.add(1);
        //intArray.add(2);
        Integer[] intArray = new Integer[]{ 1,2,3,4,5,6,7,8,9,10 };
        Arrays.sort(intArray, new Comparator<Integer>() {
            @Override
            public int compare(Integer first, Integer second) {
                return second.compareTo(first);
            }
        });

        System.out.println(Arrays.toString(intArray));
        process(() -> System.out.println("hi"));
    }
}
