package com.practices;

import java.util.Scanner;

public class VucutKitleIndeksi {
    public static void main(String[] args) {
        double boy, kilo, vucutKitle;
        Scanner read = new Scanner(System.in);

        System.out.print("Boyunuzu metre cinsinden giriniz: ");
        boy = read.nextDouble();
        System.out.print("Kilonuzu giriniz: ");
        kilo = read.nextDouble();

        vucutKitle = kilo / (boy * boy);
        System.out.println("Vucut kitle indeksiniz: " + vucutKitle);
    }
}
