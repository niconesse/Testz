package com.psg.nm;

public class Main {

    public static void main(String[] args) {
        int[] tirage = new int[5];
        for (int i = 0; i < 5; i++) {
            tirage[i] = (int) (Math.random() * 6 + 1);
        }
        java.util.Arrays.sort(tirage);
        for (int i = 0; i < 5; i++) {
            System.out.print(tirage[i] + " ");
        }
        System.out.println();
    }
}