package com.works;

public class StringMethods {
    public static void main(String[] args) {
        String str = "patika";
        char c = 99;
        System.out.println(c);
        System.out.println(str.charAt(2));

        String str2 = "patikA";
        System.out.println(str.compareToIgnoreCase(str2));

        System.out.println(str.concat(".dev"));

        System.out.println(str.contains("ti"));




    }
}
