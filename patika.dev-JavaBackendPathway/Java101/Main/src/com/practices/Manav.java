package com.practices;

import java.util.Scanner;

public class Manav {
    public static void main(String[] args) {
        double armut = 2.14, elma = 3.67, domates = 1.11, muz = 0.95, patlican = 5.00, total;
        int dKg, aKg, eKg, mKg, pKg;

        Scanner read = new Scanner(System.in);

        System.out.print("Armut kac kilo? : ");
        aKg = read.nextInt();

        System.out.print("Elma kac kilo? : ");
        eKg = read.nextInt();

        System.out.print("Domates kac kilo? : ");
        dKg = read.nextInt();

        System.out.print("Muz kac kilo? : ");
        mKg = read.nextInt();

        System.out.print("Patlican kac kilo? : ");
        pKg = read.nextInt();

        total = (armut * aKg) + (elma * eKg) + (domates * dKg) + (muz * mKg) + (patlican * pKg);

        System.out.println("Toplam tutar: " + total);
    }
}
