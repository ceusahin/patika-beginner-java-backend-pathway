package com.works;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        int password;
        boolean askPassword = true;

        do {
            System.out.print("Enter your password: ");
            password = read.nextInt();
            if (password == 123){
                System.out.println("True password!");
                askPassword = false;
            } else {
                System.out.println("Wrong password! Try again!");
            }
        } while (askPassword);
    }
}
