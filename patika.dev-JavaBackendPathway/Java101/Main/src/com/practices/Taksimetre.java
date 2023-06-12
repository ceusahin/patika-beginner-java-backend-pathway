package com.practices;

import java.util.Scanner;

public class Taksimetre {
    public static void main(String[] args) {
        int acilis = 10;
        double km, total, kmUcret = 2.20, odenecekTutar;

        Scanner read = new Scanner(System.in);
        System.out.print("Mesafeyi KM cinsinden giriniz: ");
        km = read.nextDouble();

        total = km * kmUcret;
        total += acilis;

        if (total < 20){
            odenecekTutar = 20;
        }
        else {
            odenecekTutar = total;
        }

        System.out.print("Odemeniz gereken miktar: " + odenecekTutar);

    }
}
