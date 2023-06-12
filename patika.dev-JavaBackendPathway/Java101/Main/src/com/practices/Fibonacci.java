package com.practices;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        int count, n1 = 0, n2 = 1, total = n1 + n2;

        Scanner read = new Scanner(System.in);

        do {
            System.out.print("Please enter a positive number: ");
            count = read.nextInt();
        } while (count < 0);

        for (int i = 0; i < count; i++){
            System.out.println(n1 + " + " + n2 + " = " + total);
            n1 = n2;
            n2 = total;
            total = n1 + n2;
        }

    }
}
