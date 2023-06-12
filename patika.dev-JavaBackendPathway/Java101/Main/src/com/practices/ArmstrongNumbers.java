package com.practices;

import java.util.Scanner;

public class ArmstrongNumbers {
    public static void main(String[] args) {
        int num, tempNum, digitCount = 0, result = 0, digitValue, digitPow;

        Scanner read = new Scanner(System.in);
        System.out.print("Enter a number: ");
        num = read.nextInt();
        tempNum = num;

        while (tempNum != 0){
            tempNum /= 10;
            digitCount++;
        }
        // System.out.println(digitCount);

        tempNum = num;

        while (tempNum != 0){
            digitValue = tempNum % 10;
            digitPow = 1;
            for (int i = 1; i < digitCount; i++){
                digitPow *= digitValue;
            }
            result += digitPow ;
            tempNum /= 10;
        }

        if (result == num){
            System.out.println(num + " --> a Armstrong number!");
        } else {
            System.out.println(num + " --> not an Armstrong number!");
        }


    }
}
