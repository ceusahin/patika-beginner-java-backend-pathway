package com.practices;

import java.util.Scanner;

public class DrawDiamond {
    public static void main(String[] args) {
        int h;

        Scanner read = new Scanner(System.in);

        do {
            System.out.print("Enter the height of the diamond: ");
            h = read.nextInt();
        } while (h < 0);

        int empty = h - 1;
        int hashes = 1;

        for (int i = 1; i <= h; i++){
            for (int j = 1; j <= empty; j++){
                System.out.print(" ");
            }

            for (int k = 1; k <= hashes; k++){
                System.out.print("*");
            }

            System.out.println();
            hashes += 2;
            empty--;
        }

        empty = 1;
        hashes = (h * 2) - 3;

        for (int i = 1; i <= h - 1; i++){
            for (int j = 1; j <= empty; j++){
                System.out.print(" ");
            }

            for (int k = 1; k <= hashes; k++){
                System.out.print("*");
            }

            empty++;
            hashes -= 2;
            System.out.println();
        }

    }
}
