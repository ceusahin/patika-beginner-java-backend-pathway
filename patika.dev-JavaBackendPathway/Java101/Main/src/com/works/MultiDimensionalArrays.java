package com.works;

public class MultiDimensionalArrays {
    public static void main(String[] args) {
        // row --> sutun, col --> satir
        int[] list = new int[5];
        int[] list2 = {1, 2, 3, 4, 5};

        int[][] matrix ={
                {0, 453, 939, 243, 783, 891},
                {453, 0, 490, 384, 620, 439},
                {939, 490, 0, 839, 863, 423},
                {243, 384, 839, 0, 544, 823},
                {783, 620, 863, 544, 0, 1045},
                {891, 439, 423, 823, 1045, 0}
        };
        System.out.println(matrix[4][5]);

        System.out.println("===========");

        int[][] matrix2 = new int[3][4];
        int num = 1;
        for (int i = 0; i < matrix2.length; i++){
            for (int j = 0; j < matrix2[i].length; j++){
                matrix2[i][j] = num++;
                System.out.print(matrix2[i][j] + " ");
            }
            System.out.println();
        }
    }
}
