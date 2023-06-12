package com.practices;

import java.util.Scanner;

public class HarmonicSeries {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int num;
        double res = 0;

        do {
            System.out.print("Please enter a positive number: ");
            num = read.nextInt();
        } while (num < 0);

        for (int i = 1; i <= num; i++){
            res += ((double) 1 /i);
        }

        System.out.println(res);
    }
}
