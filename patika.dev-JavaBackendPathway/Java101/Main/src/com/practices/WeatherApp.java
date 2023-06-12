package com.practices;

import java.util.Scanner;

public class WeatherApp {
    public static void main(String[] args) {
        int celcius;

        Scanner read = new Scanner(System.in);

        System.out.println("Hava kac derece sicakliga sahip? : ");
        celcius = read.nextInt();

        if(celcius >=18){
            System.out.println("Hava bugun yeterince sicak. Denize gidebilirsiniz!");
        } else if (celcius >= 8){
            System.out.println("Hava bugun ilik. Piknik yapmaya gidebilirsiniz.");
        } else {
            System.out.println("Hava bugun yeterince soguk. Evinizde sicacik oturmanizi tavsiye ederim");
        }
    }
}
