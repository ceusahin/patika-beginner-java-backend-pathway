package com.practices;

import java.util.Scanner;

public class NotOrtalamasi {
    public static void main(String[] args) {
        int mat, turkce, kimya, fizik;
        Scanner read = new Scanner(System.in);

        System.out.print("Matematik notunuzu giriniz: ");
        mat = read.nextInt();

        System.out.print("Turkce notunuzu giriniz: ");
        turkce = read.nextInt();

        System.out.print("Fizik notunuzu giriniz: ");
        fizik = read.nextInt();

        System.out.print("Kimya notunuzu giriniz: ");
        kimya = read.nextInt();

        int sum = (mat + turkce + kimya + fizik);
        double ortalama = sum / 4.0;
        System.out.print("Not ortalamaniz: " + ortalama);

    }
}
