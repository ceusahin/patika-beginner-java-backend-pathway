package com.practices;

import java.util.Scanner;

public class Daire {
    public static void main(String[] args) {
        double r, pi = 3.14, alan, cevre;
        Scanner read = new Scanner(System.in);

        System.out.print("Dairenin yarıçapını yazınız. ");
        r = read.nextDouble();
        alan = pi * r * r;
        cevre = 2 * pi * r;

        System.out.println("Dairenin alanı: " + alan);
        System.out.println("Dairenin cevresi: " + cevre);


    }
}
