package com.arrayPractices;
import java.util.Arrays;

public class MinMaxValues {
    public static void main(String[] args) {
        int[] arr = {56, 34, 1, 8, 101, -2, -33};
        Arrays.sort(arr);

        System.out.println("Min value: " + arr[0]);
        System.out.println("Max value: " + arr[arr.length - 1]);
    }
}
