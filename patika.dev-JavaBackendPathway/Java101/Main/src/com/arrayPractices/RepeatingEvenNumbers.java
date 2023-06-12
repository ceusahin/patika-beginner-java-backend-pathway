package com.arrayPractices;

import java.util.Arrays;

public class RepeatingEvenNumbers {
    public static void main(String[] args) {
        int[] numbers = {14, 16, 22, 753, -345, 122, 124, 16, 19, 54, 66, 22};
        System.out.println("Array: " + Arrays.toString(numbers));
        Arrays.sort(numbers);
        System.out.println("Sorted Array: " + Arrays.toString(numbers));

        int count = 0;

        for (int i = 0; i < numbers.length; i++){
            if (i == numbers.length - 1){
                break;
            }
            if (numbers[i] == numbers[i + 1]){
                if (numbers[i] % 2 == 0) {
                    count++;
                    System.out.print(numbers[i] + " and " + numbers[i + 1]);
                    System.out.println();
                }
            }
        }

        if (count == 0){
            System.out.println("No repeating even numbers");
        }
    }
}
