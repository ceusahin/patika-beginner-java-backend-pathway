package com.arrayPractices;

public class DrawingB {
    public static void main(String[] args) {
        String[][] letter = new String[7][4];

        for (int i = 0; i < letter.length; i++){
            for (int j = 0; j < letter[i].length; j++){
                if (j == 0){
                    System.out.print(" * ");
                } else if (j == 1) {
                    if (i == 0 || i == 3 || i == 6){
                        System.out.print(" * ");
                    } else {
                        System.out.print("   ");
                    }
                } else if (j == 2){
                    if (i == 0 || i == 3 || i == 6){
                        System.out.print(" * ");
                    } else {
                        System.out.print("   ");
                    }
                } else if (j == 3) {
                    if (i == 0 || i == 3 || i == 6){
                        System.out.print("   ");
                    } else {
                        System.out.print(" * ");
                    }
                }
            }
            System.out.println();
        }
    }
}
