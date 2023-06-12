package com.works;

import java.util.Scanner;

public class Methods {

    public static void main(String[] args) {
        helloWorld();

        int case1 = pow(2, 3);
        System.out.println(case1);
        int case2 = pow(2, 4);
        System.out.println(case2);

        Scanner read = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int n1 = read.nextInt();
        System.out.print("Enter second number: ");
        int n2 = read.nextInt();

        System.out.println(sum(n1, n2));
    }

    static void helloWorld(){
        System.out.println("Hello World!");
    }
    static int pow(int base, int exp){
        int result = 1;
        for (int i = 1; i <= exp; i++){
            result *= base;
        }
        return result;
    }

    static int sum(int a, int b){
        return a + b;
    }
}
