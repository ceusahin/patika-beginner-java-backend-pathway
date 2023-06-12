package com.practices;

import java.util.Scanner;

public class EbobEkok {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int n1, n2, ebob = 1, ekok = 1, i = 1;
        System.out.print("Enter the smaller number: ");
        n1 = read.nextInt();
        System.out.print("Enter the bigger number: ");
        n2 = read.nextInt();

        while (i <= n1){
            if (n1 % i == 0 && n2 % i == 0){
                ebob = i;
            }
            i++;
        }

        while (i <= n1 * n2){
            if (i % n1 == 0 && i % n2 == 0){
                ekok = i;
                break;
            }
            i++;
        }

        System.out.println("EBOB: " + ebob);
        System.out.println("EKOK: " + ekok);

    }
}
