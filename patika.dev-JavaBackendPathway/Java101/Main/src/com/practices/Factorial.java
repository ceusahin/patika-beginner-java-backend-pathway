package com.practices;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        int num, empty ,sum = 1;
        Scanner read = new Scanner(System.in);

        do {
            System.out.print("Enter a number: ");
            num = read.nextInt();
            // System.out.println(num);
        } while (num < 0);

        empty = num;

        for (int i = num; i > 0; i--){
            sum *= i;
        }

        System.out.println("Total: " + sum);
    }
}
