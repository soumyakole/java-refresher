package com.soumya.concurrency.forkjoin;

import java.util.concurrent.TimeUnit;

public class AppleTree {

    public static AppleTree[] newGarden(int size){
        AppleTree[] appleTrees = new AppleTree[size];
        for (int i = 0; i < appleTrees.length; i++) {
            appleTrees[i] = new AppleTree("🌳#" + i);
        }
        return appleTrees;
    }

    private final String treeLabel;
    private final int numberOfApples;

    public AppleTree(String treeLabel){
        this.treeLabel = treeLabel;
        this.numberOfApples =3;
    }

    public int pickApples(String workerName){
        try {
            System.out.printf("%s started picking apple from tree %s \n", workerName, treeLabel);
            TimeUnit.SECONDS.sleep(1);
            System.out.printf("%s picked %d apples from tree %s \n", workerName, numberOfApples, treeLabel);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return numberOfApples;
    }

}
