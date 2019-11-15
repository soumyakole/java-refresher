package com.soumya.concurrency.forkjoin;

import java.util.Arrays;
import java.util.concurrent.Callable;
import java.util.concurrent.ForkJoinPool;

public class SimpleForkJoin {
    public static void main(String[] args) {
        AppleTree[] appleTrees = AppleTree.newGarden(6);

        Callable<Void> applePicker1 = createApplePicker(appleTrees, 0, 2, "Soumya");
        Callable<Void> applePicker2 = createApplePicker(appleTrees, 2, 4, "Aditi");
        Callable<Void> applePicker3 = createApplePicker(appleTrees, 4, 6, "Adriyaman");
        ForkJoinPool.commonPool().invokeAll(Arrays.asList(applePicker1, applePicker2, applePicker3));

    }

    public static Callable<Void> createApplePicker(AppleTree[] appleTrees, int fromIndexInclusive, int toIndexExclusive,
                                                   String workerName) {
        return () -> {
            for (int i = fromIndexInclusive; i < toIndexExclusive; i++) {
                appleTrees[i].pickApples(workerName);
            }
            return null;
        };
    }
}
