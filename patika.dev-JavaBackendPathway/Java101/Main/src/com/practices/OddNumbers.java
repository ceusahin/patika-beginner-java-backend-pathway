package com.practices;

import java.util.Scanner;

public class OddNumbers {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int num, sum = 0;

        do {
            System.out.print("Enter a number: ");
            num = read.nextInt();

            if (num % 4 == 0){
                sum += num;
            }
        } while (num % 2 == 0);

        System.out.println(sum);

    }
}
