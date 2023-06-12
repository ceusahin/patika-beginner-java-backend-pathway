package com.practices;

import java.util.Scanner;

public class KdvTutari {
    public static void main(String[] args) {
        float fiyat, kdv = 0.18f, kdvTutar, kdvFiyat;

        Scanner read = new Scanner(System.in);

        System.out.print("Ürünün fiyatı nedir? ");
        fiyat = read.nextFloat();

        kdvTutar = fiyat * kdv;
        kdvFiyat = fiyat + kdvTutar;

        System.out.println("Ürünün KDV'li fiyatı: " + kdvFiyat);
        System.out.println("KDV miktarı: " + kdvTutar);

    }
}
