package com.practices;

import java.util.Scanner;

public class NotOrtalamasi2 {
    public static void main(String[] args) {
        int mat, turkce, fizik, kimya;
        double avg;

        Scanner read = new Scanner(System.in);

        System.out.print("Matematik notunuz: ");
        mat = read.nextInt();
        System.out.print("Turkce notunuz: ");
        turkce = read.nextInt();
        System.out.print("Fizik notunuz: ");
        fizik = read.nextInt();
        System.out.print("Kimya notunuz: ");
        kimya = read.nextInt();

        avg = (mat + turkce + fizik + kimya) / 4.00;

        if (avg <= 55){
            System.out.println("Sinifta kaldiniz..");
        } else {
            System.out.println("Sinifi gectiniz..");
        }

        System.out.println("Ortalamaniz: " + avg);

    }
}
