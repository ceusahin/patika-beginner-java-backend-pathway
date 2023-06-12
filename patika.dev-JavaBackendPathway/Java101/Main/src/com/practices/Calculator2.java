package com.practices;

import java.util.Scanner;

public class Calculator2 {
    public static void main(String[] args) {
        int select, n1, n2;
        double db;
        Scanner read = new Scanner(System.in);
        System.out.println("1- Toplama\n2- Cikarma\n3- Carpma\n4- Bolme\n5- Uslu sayi\n6- Faktoriyel\n7- Mod alma\n8- Dikdortgen alan hesabi\n9- Dairenin alani\n0- Cikis");
        do {
            System.out.print("Lutfen yapmak istediginiz islemi seciniz.(0-9) : ");
            select = read.nextInt();
            switch (select){
                case 0:
                    System.out.println("Bizi tercih ettiginiz icin tesekkur ederiz.");
                    break;
                case 1:
                    System.out.print("Ilk sayi: ");
                    n1 = read.nextInt();
                    System.out.print("Ikinci sayi: ");
                    n2 = read.nextInt();
                    System.out.println("Sonuc: " + sum(n1, n2));
                    break;
                case 2:
                    System.out.print("Buyuk sayi: ");
                    n1 = read.nextInt();
                    System.out.print("Kucuk sayi: ");
                    n2 = read.nextInt();
                    System.out.println("Sonuc: " + minus(n1, n2));
                    break;
                case 3:
                    System.out.print("Ilk sayi: ");
                    n1 = read.nextInt();
                    System.out.print("Ikinci sayi: ");
                    n2 = read.nextInt();
                    System.out.println("Sonuc: " + times(n1, n2));
                    break;
                case 4:
                    System.out.print("Ilk sayi: ");
                    n1 = read.nextInt();
                    System.out.print("Ikinci sayi: ");
                    n2 = read.nextInt();
                    System.out.println("Sonuc: " + divided(n1, n2));
                    break;
                case 5:
                    System.out.print("Taban sayi: ");
                    n1 = read.nextInt();
                    System.out.print("Us sayi: ");
                    n2 = read.nextInt();
                    System.out.println("Sonuc: " + pow(n1, n2));
                    break;
                case 6:
                    System.out.print("Faktoriyeli alinacak sayi: ");
                    n1 = read.nextInt();
                    System.out.println("Sonuc: " + factorial(n1));
                    break;
                case 7:
                    System.out.print("Buyuk sayi: ");
                    n1 = read.nextInt();
                    System.out.print("Kucuk sayi: ");
                    n2 = read.nextInt();
                    System.out.println("Sonuc: " + mod(n1, n2));
                    break;
                case 8:
                    System.out.print("Dikdortgenin uzun kenari: ");
                    n1 = read.nextInt();
                    System.out.print("Dikdortgenin kisa kenari: ");
                    n2 = read.nextInt();
                    System.out.println("Dikdortgenin alani: " + dikdortgen(n1, n2));
                    break;
                case 9:
                    System.out.print("Dairenin yaricapini giriniz: ");
                    db = read.nextDouble();
                    System.out.println("Dairenin alani: " + daire(db));
                    break;
            }
        } while (select != 0);

    }

    public static int sum(int a, int b){
        return a + b;
    }

    public static int minus(int a, int b){
        return a - b;
    }

    public static int times(int a, int b){
        return a * b;
    }

    public static int divided(int a, int b){
        return a / b;
    }

    public static int pow(int base, int exp){
        int res = 1;
        for (int i = 1; i <= exp; i++){
            res *= base;
        }
        return res;
    }

    public static int factorial(int a){
        int res = 1;
        for (int i = 1; i <= a; i++){
            res *= i;
        }
        return res;
    }

    public static int mod(int a, int b){
        return a % b;
    }

    public static int dikdortgen(int a, int b){
        return a * b;
    }

    public static double daire(double a){
        double pi = 3.14;
        return a * a * pi;
    }
}
