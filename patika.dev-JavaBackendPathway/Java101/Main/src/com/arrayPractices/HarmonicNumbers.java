package com.arrayPractices;

import java.util.Scanner;

public class HarmonicNumbers {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("Enter arrays length: ");
        int length = read.nextInt();
        double[] arr = new double[length];

        for (int i = 0; i < length; i++){
            System.out.print((i + 1) + "'s number: ");
            arr[i] = read.nextDouble();
        }

        double hAvg = 0.0, sum = 0.0;

        for (double j : arr) {
            sum += 1.0 / j;
        }

        System.out.println();
        hAvg = arr.length / sum;
        System.out.println(hAvg);
    }
}
