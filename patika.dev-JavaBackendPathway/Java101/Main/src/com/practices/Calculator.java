package com.practices;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        int n1, n2, select;

        Scanner read = new Scanner(System.in);

        System.out.print("Enter first number: ");
        n1 = read.nextInt();
        System.out.print("Enter second number: ");
        n2 = read.nextInt();

        System.out.println("Choose which action you want to do.");
        System.out.println("1- (+)\n2- (-)\n3- (*)\n4- (/)");
        select = read.nextInt();

        switch (select){
            case 1:
                System.out.println(n1 + n2);
                break;
            case 2:
                System.out.println(n1 - n2);
                break;
            case 3:
                System.out.println(n1 * n2);
                break;
            case 4:
                if(n2 != 0){
                    System.out.println(n1 / n2);
                }
                else {
                    System.out.println("Can't divided by zero. ERROR!");
                }
                break;
            default:
                System.out.println("Please choose 1-4 actions.");
                break;
        }

    }
}
