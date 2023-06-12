package com.works;

public class ForEach {
    public static void main(String[] args) {
        String[] cars = {"BMW", "Mercedes-Benz", "Porsche", "Audi", "Bugatti", "Nissan"};
        for (String car: cars) {
            System.out.println(car);
        }

        System.out.println("============");

        int[][] matris = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
                {10, 11, 12}
        };

        for (int[] row : matris){
            for (int col : row){
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }
}
