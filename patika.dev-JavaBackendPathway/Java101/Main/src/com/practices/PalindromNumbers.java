package com.practices;

import java.util.Scanner;

public class PalindromNumbers {
    public static void main(String[] args) {
        int number;
        Scanner read = new Scanner(System.in);
        number = read.nextInt();

        if (isPalindrom(number)){
            System.out.println(number + " is a palindrome number.");
        } else {
            System.out.println(number + " is not a palindrome number.");
        }
    }

    public static boolean isPalindrom(int num){
        int lastNum, temp = num, reverseNum = 0;

        while (temp != 0){
            lastNum = temp % 10;
            reverseNum = (reverseNum * 10) + lastNum;
            temp /= 10;
        }
        return num == reverseNum;
    }
}
