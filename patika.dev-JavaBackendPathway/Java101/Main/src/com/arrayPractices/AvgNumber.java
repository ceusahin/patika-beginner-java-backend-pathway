package com.arrayPractices;

public class AvgNumber {
    public static void main(String[] args) {
        int[] list = {1, 2, 3, 4, 5};
        double avg = 0.0, sum = 0.0;

        for (int i = 0; i < list.length; i++){
            sum += list[i];
        }

        avg = sum / list.length;
        System.out.println(avg);
    }
}
