package com.bl.multit;

public class NumberThread extends Thread {
    public void run() {
        for (long i = 0; i <= 100; i++) {
                System.out.println(i+1);
        }
        System.out.println("bye num");
    }

}