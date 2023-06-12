package com.works;

public class LocalVariables {
    public static void main(String[] args) {
        int a = 5;
        if (a < 10){
            int b = 20;
            // correct --> System.out.println(b);
        }
        // incorrect --> System.out.println(b);
    }
}
