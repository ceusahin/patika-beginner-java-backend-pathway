package com.works;

public class Arrays {
    public static void main(String[] args) {
        int[] list = new int[10];

        for (int i = 0; i < list.length; i++){
            list[i] = (i * 10) + 10;
            // System.out.println(list[i]);
        }

        int[] list2 = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        printArray(list2);

        System.out.println("============");

        double[] listD = {1.1, 2.2, 3.3};
        printArray(listD);

        System.out.println("============");

        int[] newList = reverseArr(list2);
        printArray(newList);


    }

    static void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }

    static void printArray(double[] arr){
        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }

    static int[] reverseArr(int[] arr){
        int[] reverse = new int[arr.length];
        for (int i = 0, j = arr.length - 1; i < arr.length; i++, j--){
            reverse[i] = arr[j];
        }

        return reverse;
    }
}
