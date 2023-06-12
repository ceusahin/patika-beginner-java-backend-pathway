package com.practices;

import java.util.Scanner;

public class ChineseZodiac {
    public static void main(String[] args) {
        int birthYear, mod;
        String animal = "";

        Scanner read = new Scanner(System.in);
        System.out.print("Enter your birth year: ");
        birthYear = read.nextInt();

        mod = birthYear % 12;

        switch (mod){
            case 0:
                animal = "Maymun";
                break;
            case 1:
                animal = "Horoz";
                break;
            case 2:
                animal = "Köpek";
                break;
            case 3:
                animal = "Domuz";
                break;
            case 4:
                animal = "Fare";
                break;
            case 5:
                animal = "Öküz";
                break;
            case 6:
                animal = "Kaplan";
                break;
            case 7:
                animal = "Tavşan";
                break;
            case 8:
                animal = "Ejderha";
                break;
            case 9:
                animal = "Yılan";
                break;
            case 10:
                animal = "At";
                break;
            case 11:
                animal = "Koyun";
                break;
            default:
                System.out.println("Lütfen dogum yilinizi dogru giriniz.");

        }

        System.out.println("Your chinese zodiac is: " + animal);
    }
}
