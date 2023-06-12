package com.practices;

import java.util.Scanner;

public class UcakBileti {
    public static void main(String[] args) {

        int travelType;
        double perKm = 0.10, km, price, afterPrice, age, discount20, discount30, discount50, discount10;

        Scanner read = new Scanner(System.in);
        System.out.print("Mesafeyi km turunden giriniz: ");
        km = read.nextDouble();
        System.out.print("Yasinizi giriniz: ");
        age = read.nextDouble();
        System.out.print("Yolculuk tipini giriniz (1- Tek yon / 2- Gidis donus): ");
        travelType = read.nextInt();

        price = perKm * km;
        afterPrice = price;
        discount20 = price * 0.20;
        discount10 = price * 0.10;
        discount30 = price * 0.30;
        discount50 = price * 0.50;

        if (age < 12){
            afterPrice = afterPrice - discount50;
        } else if (age >= 12 && age <= 24){
            afterPrice = afterPrice - discount10;
        } else if (age >= 65){
            afterPrice = afterPrice - discount30;
        } else {
            afterPrice = price;
        }

        switch (travelType){
            case 1:
                System.out.println("Toplam tutar: " + afterPrice);
                break;
            case 2:
                afterPrice = afterPrice - discount20;
                System.out.println("Toplam tutar: " + afterPrice * 2);
                break;
            default:
                System.out.println("Hatalı veri girdiniz!");
                break;
        }


    }
}
