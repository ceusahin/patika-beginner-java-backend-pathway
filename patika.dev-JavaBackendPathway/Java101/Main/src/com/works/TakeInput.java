package com.works;

import java.util.Scanner;

public class TakeInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("What is your name? ");
        String name = input.nextLine();
        System.out.print("What is your surname? ");
        String surname = input.nextLine();

        System.out.println("Welcome! " + name + " " + surname);

    }
}
