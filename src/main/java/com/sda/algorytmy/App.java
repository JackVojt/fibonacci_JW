package com.sda.algorytmy;

public class App {
    public static void main(String[] args) {
        int tab[] = new int [21];
        tab[0] = 0;
        tab[1] = 1;
        for (int i = 2; i < tab.length; i++){
            tab[i] = tab[i-2] + tab[i-1];
            System.out.println(tab[i]);
        }


    }

}


