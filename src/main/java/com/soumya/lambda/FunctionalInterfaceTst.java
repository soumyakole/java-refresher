package com.soumya.lambda;

/**
 * A functional interface is an interface that contains only one abstract method.
 * They can have only one functionality to exhibit.
 * From Java 8 onwards, lambda expressions can be used to represent the instance of a functional interface.
 * A functional interface can have any number of default methods.
 * Runnable, ActionListener, Comparable are some of the examples of functional interfaces.
 */

@FunctionalInterface
interface FunctionalInterfaceTst {
    int calculate(int x);
}
