package com.works;

import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        String password = "12345", inputPassword;
        boolean isPasswordTrue = false;

        while (!isPasswordTrue){
            Scanner read = new Scanner(System.in);
            System.out.print("Enter your password: ");
            inputPassword = read.nextLine();

            if (inputPassword.contentEquals(password)){
                System.out.println("Successfully logged in!");
                isPasswordTrue = true;
            } else {
                System.out.println("Failed to log in! Wrong password! Try again!");
            }
        }
    }
}
