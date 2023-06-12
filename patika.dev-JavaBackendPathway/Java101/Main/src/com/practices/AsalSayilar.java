package com.practices;

public class AsalSayilar {
    public static void main(String[] args) {
        int baslangic = 1, bitis = 100;

        System.out.print("1-100 arasi asal sayilar: ");
        for (int num = baslangic; num < bitis; num++){
            boolean isAsal = true;

            if (num < 2) {
                isAsal = false;
            } else {
                for (int i = 2; i <= Math.sqrt(num); i++){
                    if (num % i == 0){
                        isAsal = false;
                        break;
                    }
                }
            }

            if (isAsal == true){
                System.out.println(num);
            }
        }


    }
}
