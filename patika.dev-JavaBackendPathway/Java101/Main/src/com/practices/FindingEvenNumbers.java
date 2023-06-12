package com.practices;

import java.util.Scanner;

public class FindingEvenNumbers {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        int num;

        System.out.print("Enter a number: ");
        num = read.nextInt();

        for (int i = 1; i <= num; i++){
            if (i % 2 == 0) {
                System.out.print(" - " + i + " - ");
            }
        }
    }
}
