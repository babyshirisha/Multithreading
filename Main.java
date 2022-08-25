package com.bl.multit;

public class Main {
    public static void main(String[] args) {
            NumberThread num = new NumberThread();
            num.start();
            num.setDaemon(true);
            CharacterRunnable characterRunnable = new CharacterRunnable();
            Thread charThread = new Thread(characterRunnable);
            charThread.start();
            System.out.println("bye main");
    }

}
