package com.practices;

import java.util.Scanner;

// @author Hakan Sahin
public class RecursivePow {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int base, exp;

        do {
            System.out.print("Taban giriniz: ");
            base = read.nextInt();
            System.out.print("Us giriniz: ");
            exp = read.nextInt();
        } while (base < 0 && exp < 0);

        System.out.println("Sonuc: " + recursivePow(base, exp));
    }

    static int recursivePow(int a, int b){
        if (b == 0){
            return 1;
        } else {
            return a * recursivePow(a, b - 1);
        }
    }
}