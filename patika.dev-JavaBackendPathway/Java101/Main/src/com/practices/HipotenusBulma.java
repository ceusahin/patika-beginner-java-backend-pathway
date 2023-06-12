package com.practices;

import java.util.Scanner;

public class HipotenusBulma {
    public static void main(String[] args) {
        int kenar1, kenar2;
        double hipotenus;

        Scanner read = new Scanner(System.in);
        System.out.print("1. dik kenari giriniz: ");
        kenar1 = read.nextInt();
        System.out.print("2. dik kenari giriniz: ");
        kenar2 = read.nextInt();

        hipotenus = Math.sqrt((kenar1 * kenar1) + (kenar2 * kenar2));
        System.out.println("Hipotenus kenariniz: " + hipotenus);
    }
}
