package com.sda.algorytmy;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        fib2(N);
        int tab[] = new int[21];
        tab[0] = 0;
        tab[1] = 1;
        for (int i = 2; i < tab.length; i++) {
            tab[i] = tab[i - 2] + tab[i - 1];
            System.out.println(tab[i]);
        }
    }

    public static void fib2(int N) {

        if (N < 2) {
            System.out.println(N);
        } else {
            int a = 0;
            int b = 1;
            int c = 1;
            int k = 2;
            while (k < N) {
                a = b; // b przyjmuje wartosc a
                b = c;
                c = a + b;
                k++;
            }
            System.out.println(c);

        }
    }
}


