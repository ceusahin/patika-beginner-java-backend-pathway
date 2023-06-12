package com.practices;

import java.util.Scanner;
// @author Hakan Sahin
public class RecursiveAsal {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int num;
        do {
            System.out.print("Enter a number: ");
            num = read.nextInt();
        } while (num < 0);

        if (isAsal(num, 2)){
            System.out.println(num + " is asal number.");
        } else {
            System.out.println(num + " is not an asal number.");
        }
    }

    public static boolean isAsal(int a,int b){
        if (a < 2){
            return false;
        }
        if (a == 2){
            return true;
        }
        if (a % b == 0){
            return false;
        }
        if (b * b > a){
            return true;
        }
        return isAsal(a, b + 1);
    }
}
