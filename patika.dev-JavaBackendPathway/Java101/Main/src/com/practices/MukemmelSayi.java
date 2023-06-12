package com.practices;

import java.util.Scanner;

public class MukemmelSayi {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("Bir sayi giriniz: ");
        int num = read.nextInt();
        int sum = 0;

        for (int i = 1; i <= num; i++){
            if (num % i == 0){
                sum += i;
            }
        }

        if (sum == num * 2){
            System.out.println(num + " sayisi mukemmel sayidir.");
        } else {
            System.out.println(num + " sayisi mukemmel sayi degildir.");
        }

    }
}
