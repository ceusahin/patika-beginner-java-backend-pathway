package com.arrayPractices;

import java.util.Scanner;

public class Frequency {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int n, numCount = 0;

        do {
            System.out.print("Enter an array's length: ");
            n = read.nextInt();
        } while (n < 0);


        int[] arr = new int[n];
        for (int k = 0; k <arr.length; k++){
            System.out.print((k + 1) + "'s value is: ");
            arr[k] = read.nextInt();
        }

        int[] values = new int[n];
        int[] frequency = new int[n];

        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            boolean isRepeat = false;

            for (int j = 0; j < arr.length; j++) {
                if (num == values[j]) {
                    frequency[j]++;
                    isRepeat = true;
                    break;
                }
            }

            if (!isRepeat) {
                values[numCount] = num;
                frequency[numCount] = 1;
                numCount++;
            }
        }

        for (int i = 0; i < numCount; i++) {
            System.out.println("Value: " + values[i] + ", Frequency: " + frequency[i]);
        }
    }
}
