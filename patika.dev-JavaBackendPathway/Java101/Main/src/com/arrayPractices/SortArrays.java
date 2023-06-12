package com.arrayPractices;

import java.util.Arrays;
import java.util.Scanner;

public class SortArrays {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int arrL;
        do {
            System.out.print("Enter an array length: ");
            arrL = read.nextInt();
        } while (arrL < 0);

        int[] arr = new int[arrL];

        for (int i = 0; i < arr.length; i++){
            System.out.print("Enter " + (i + 1) + " 's number: ");
            arr[i] = read.nextInt();
        }

        Arrays.sort(arr);
        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }
}
