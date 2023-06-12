package com.practices;

import java.util.Scanner;

public class Combination {
    public static void main(String[] args) {
        int n, r, sum = 0, nFac = 1, rFac = 1, minusFac = 1, minus, combination;
        Scanner read = new Scanner(System.in);

        do {
            System.out.print("Enter first number: ");
            n = read.nextInt();
            System.out.print("Enter second number: ");
            r = read.nextInt();
            // System.out.println(num);
        } while (n < 0 && r < 0);

        minus = n - r;

        for (int i = n; i > 0; i--){
            nFac *= i;
        }
        for (int i = r; i > 0; i--){
            rFac *= i;
        }
        for (int i = minus; i > 0; i--){
            minusFac *= i;
        }

        combination = nFac / (rFac * minusFac);

        System.out.println("C(" + n + " ," + r + ") =" + combination);


    }
}
