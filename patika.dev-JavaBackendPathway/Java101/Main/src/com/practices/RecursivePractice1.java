package com.practices;

import java.util.Scanner;

public class RecursivePractice1 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = read.nextInt();
        recursiveFunction(num, num);
    }

    public static void recursiveFunction(int number, int originalNumber) {
        System.out.println("Your number: " + number);

        if (number <= 0) {
            while (number != originalNumber){
                number += 5;
                System.out.println("Your number: " + number);
                if (number == originalNumber){
                    return;
                }
            }
        } else {
            number -= 5;
            recursiveFunction(number, originalNumber);
        }
    }
}
