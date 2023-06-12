package com.arrayPractices;

import java.util.Arrays;
import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("Enter array length: ");
        int arrLength = read.nextInt();
        int[] arr = new int[arrLength];

        for (int i = 0; i < arr.length; i++){
            System.out.print((i+1) + "'s value: ");
            arr[i] = read.nextInt();
        }

        System.out.print("Enter a random number: ");
        int val = read.nextInt();

        int min = val, max = val;
        Arrays.sort(arr);

        // small
        for (int i : arr){
            if (i < val){
                min = i;
            }
        }

        // large
        for (int j = arr.length - 1; j >= 0; j--){
                if (arr[j] > val){
                    max = arr[j];
                }
        }

        System.out.println("The smallest number closest to the value : " + min);
        System.out.println("Largest number closest to the value : " + max);
    }
}
