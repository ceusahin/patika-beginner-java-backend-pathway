package com.practices;

import java.util.Scanner;

public class BurcBulma {
    public static void main(String[] args) {
        int month, day;
        String burc = "";

        Scanner read = new Scanner(System.in);
        System.out.print("Dogdunuz ayi sayi cinsinden yaziniz. (1-12) : ");
        month = read.nextInt();
        System.out.print("Dogdugunuz gunu sayi cinsinden yaziniz. (1-31) : ");
        day = read.nextInt();

        switch (month){
            case 1:
                if (day < 23){
                    burc = "Oglak burcu";
                }
                else {
                    burc = "Kova burcu";
                }
                break;
            case 2:
                if (day < 20){
                    burc = "Kova burcu";
                }
                else {
                    burc = "Balik burcu";
                }
                break;
            case 3:
                if (day < 21){
                    burc = "Balik burcu";
                }
                else {
                    burc = "Koc burcu";
                }
                break;
            case 4:
                if (day < 21){
                    burc = "Koc burcu";
                }
                else {
                    burc = "Boga burcu";
                }
                break;
            case 5:
                if (day < 22){
                    burc = "Boga burcu";
                }
                else {
                    burc = "Ikizler burcu";
                }
                break;
            case 6:
                if (day < 23){
                    burc = "Ikizler burcu";
                }
                else {
                    burc = "Yengec burcu";
                }
                break;
            case 7:
                if (day < 23){
                    burc = "Yengec burcu";
                }
                else {
                    burc = "Aslan burcu";
                }
                break;
            case 8:
                if (day < 23){
                    burc = "Aslan burcu";
                }
                else {
                    burc = "Basak burcu";
                }
                break;
            case 9:
                if (day < 24){
                    burc = "Basak burcu";
                }
                else {
                    burc = "Terazi burcu";
                }
                break;
            case 10:
                if (day < 23){
                    burc = "Terazi burcu";
                }
                else {
                    burc = "Akrep burcu";
                }
                break;
            case 11:
                if (day < 22){
                    burc = "Akrep burcu";
                }
                else {
                    burc = "Yay burcu";
                }
                break;
            case 12:
                if (day < 22){
                    burc = "Yay burcu";
                }
                else {
                    burc = "Oglak burcu";
                }
                break;
            default:
                System.out.println("Lütfen dogdugunuz ayi sayi cinsinden giriniz. (1-12)");
                break;
        }

        System.out.println("Burcunuz: " + burc);

    }
}
