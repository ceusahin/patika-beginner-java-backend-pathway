package com.practices;

import java.util.Scanner;

public class DigitPlus {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int num, sum = 0, digitValue;

        do {
            System.out.print("Please enter positive number: ");
            num = read.nextInt();
        } while (num < 0);

        int tempNum = num;

        while (tempNum != 0){
            digitValue = tempNum % 10;
            sum += digitValue;
            tempNum /= 10;
        }

        System.out.println(sum);

    }
}
