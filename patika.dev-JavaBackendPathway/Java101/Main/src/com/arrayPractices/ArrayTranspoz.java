package com.arrayPractices;

public class ArrayTranspoz {
    static void printArr(int[][] arr){
        for (int[] row : arr){
            for (int col : row){
                System.out.print(col + "  ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
        };

        int[][] trArr = new int[arr[0].length][arr.length];

        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
                trArr[j][i] = arr[i][j];
            }
        }

        System.out.println("Matrix: ");
        printArr(arr);

        System.out.println("Transpoze: ");
        printArr(trArr);
    }
}
