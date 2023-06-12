package com.practices;

import java.util.Scanner;

public class RecursiveFibonacci {
    public static void main(String[] args) {
        int n;
        Scanner read = new Scanner(System.in);
        do {
            System.out.print("Enter a number: ");
            n = read.nextInt();
        } while (n < 0);
        System.out.println(fib(n));
    }

    public static int fib(int n){
        if (n == 1 || n == 2){
            return 1;
        }
        return fib(n - 1) + fib(n - 2);
    }
}
