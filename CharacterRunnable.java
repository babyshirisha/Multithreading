package com.bl.multit;

public class CharacterRunnable implements Runnable {
    public void run() {
        for (char i = 'a'; i <= 'z'; i++) {
            System.out.println(i+1);
        }
        System.out.println("byee char");
    }
}


