package com.practices;

import java.util.Scanner;

public class UsBulma {
    public static void main(String[] args) {
        int num, num2, total = 1;
        Scanner read = new Scanner(System.in);

        do {
            System.out.print("Enter first number: ");
            num = read.nextInt();
            System.out.print("Enter second number: ");
            num2 = read.nextInt();
        } while (num < 0);

        for (int i = 1; i <= num2; i++){
            total *= num;
        }

        System.out.println("Total: " + total);

    }
}
