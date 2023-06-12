package com.works;

import  java.util.Arrays;

public class ArrayMethods {
    public static void main(String[] args) {
        int[] list = {1, 2, 3, 4, 5, 6, 7};
        // System.out.println(Arrays.toString(list));

        Arrays.fill(list, 10);
        // System.out.println(Arrays.toString(list));

        int[] listSort = {15, 2, 312, 5555, 5, 23, 7};
        // Arrays.sort(listSort);
        // System.out.println(Arrays.toString(listSort));
        // System.out.println(Arrays.binarySearch(listSort, 5555));

        int[] copyArr = Arrays.copyOf(listSort, 4);
        //System.out.println(Arrays.toString(copyArr));

        int[] list2 = {1, 2, 3, 4, 5, 6, 7};
        int[] list3 = {1, 2, 3, 4, 5, 6, 7};
        int[] list4 = {1, 2, 3, 4, 5, 6, 7, 8};
        // System.out.println(Arrays.equals(list2, list3)); // true
        // System.out.println(Arrays.equals(list3, list4)); // false

    }
}
