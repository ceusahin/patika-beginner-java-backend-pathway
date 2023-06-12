package com.practices;

import java.util.Scanner;

public class MinMaxNumbers {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE, num, numCount;

        System.out.print("How many numbers do u want to enter? : ");
        numCount = read.nextInt();

        for (int i = 1; i <= numCount; i++){
            System.out.print("Enter " + i + ". number: ");
            num = read.nextInt();
            if (num > max){
                max = num;
            }

            if (num < min){
                min = num;
            }
        }

        System.out.println("Max value is: " + max +"\nMin value is: " + min);
    }
}
