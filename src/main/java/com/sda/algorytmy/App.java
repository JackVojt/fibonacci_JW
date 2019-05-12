package com.sda.algorytmy;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        fib2(x);
        int tab[] = new int[21];
        tab[0] = 0;
        tab[1] = 1;
        for (int i = 2; i < tab.length; i++) {
            tab[i] = tab[i - 2] + tab[i - 1];
            System.out.println(tab[i]);
        }
    }

    public static void fib2(int x) {

        if (x < 2) {
            System.out.println(x);
        }
        int a = 0;
        int b = 1;
        int wynik = 1;
        for (int i = 2; i < x; i++) {
            a = b;
            b = wynik;
            wynik = a + b;
        }
        System.out.println(wynik);

    }
}


