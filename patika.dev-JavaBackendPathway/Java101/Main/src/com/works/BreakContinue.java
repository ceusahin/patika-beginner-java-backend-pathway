package com.works;

public class BreakContinue {
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++){
            if (i == 5){
                System.out.println(i);
                break;
            }
            System.out.println("i'nin degeri : " + i);
        }

        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - -");

        for (int i = 0; i <= 10; i++){
            if (i == 5){
                continue;
            }
            System.out.println("i'nin degeri : " + i);
        }
    }
}
