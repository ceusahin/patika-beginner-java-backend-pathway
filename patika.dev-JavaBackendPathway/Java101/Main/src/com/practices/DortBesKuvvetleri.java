package com.practices;

import java.util.Scanner;

public class DortBesKuvvetleri {
    public static void main(String[] args) {
        int num;
        Scanner read = new Scanner(System.in);
        System.out.print("Lutfen pozitif bir sayi giriniz: ");

        do {
            num = read.nextInt();
            // System.out.println(num);
        } while (num < 0);

        System.out.print("Dordun kuvvetleri --> ");
        for (int i = 1; i <= num; i *= 4){
            System.out.print(i + " - ");
        }

        System.out.println();

        System.out.print("Besin kuvvetleri --> ");
        for (int k = 1; k <= num; k *= 5){
            System.out.print(k + " - ");
        }
    }
}
