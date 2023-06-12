package com.practices;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Random random = new Random();
        int num = random.nextInt(100);

        Scanner read = new Scanner(System.in);
        int right = 0;
        int selected;
        int[] wrongNums = new int[5];
        boolean isWin = false;
        boolean isError = false;

        System.out.println(num);

        while (right < 5){
            System.out.print("Please enter your guess: ");
            selected = read.nextInt();

            if (selected < 0 || selected > 99){
                System.out.println("Please enter a number from 0 to 100.");
                if (isError){
                    right++;
                    System.out.println("Too much wrong attempts. Remaining attempts: " + (5 - right));
                } else {
                    isError = true;
                    System.out.println("If u attempt wrong number again, u will lose your chance to attempt.");
                }
                continue;
            }

            if (selected == num){
                System.out.println("Congratz! True!");
                isWin = true;
                break;
            } else {

                System.out.println("\nWRONG NUMBER!");
                if (selected > num){
                    System.out.println(selected + " is greater than secret number.");
                } else {
                    System.out.println(selected + " is lower than secret number.");
                }
                wrongNums[right] = selected;
                right++;
                System.out.println((5 - right) + " attempts to left.\n");
            }
        }

        if (!isWin){
            System.out.println("You lose! Secret number was: " + num);
            if (!isError){
                System.out.println("Your guesses: " + Arrays.toString(wrongNums));
            }
        }
    }
}
