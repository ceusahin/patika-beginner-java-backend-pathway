package com.practices;

import java.util.Scanner;

public class SortNumbers {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int n1, n2, n3, max, min, mid;

        System.out.print("Enter 1. number: ");
        n1 = read.nextInt();
        System.out.print("Enter 2. number: ");
        n2 = read.nextInt();
        System.out.print("Enter 3. number: ");
        n3 = read.nextInt();

        if (n1 > n2 && n1 > n3){
            max = n1;
            if (n2 > n3){
                min = n3;
                mid = n2;
            } else {
                mid = n3;
                min = n2;
            }
        } else if (n2 > n1 && n2 > n3) {
            max = n2;
            if (n1 > n3){
                mid = n1;
                min = n3;
            } else {
                mid = n3;
                min = n1;
            }
        } else {
            max = n3;
            if (n1 > n2){
                mid = n1;
                min = n2;
            } else {
                mid = n2;
                min = n1;
            }
        }

        System.out.println("Max: " + max + "\n" + "Mid: " + mid + "\n" + "Min: " + min);


    }
}
