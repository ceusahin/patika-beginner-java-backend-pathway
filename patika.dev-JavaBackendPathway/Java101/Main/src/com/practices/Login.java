package com.practices;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {

        // username: patika     password: java123
        String userName, password, newPass;
        int reset;

        Scanner read = new Scanner(System.in);
        System.out.print("Username: ");
        userName = read.nextLine();
        System.out.print("Password: ");
        password = read.nextLine();

        if (userName.equals("patika") && password.equals("java123")){
            System.out.println("You are logged in!");
        } else {
            System.out.println("Invalid username or password!");
        }

        System.out.print("Reset password? (1) Yes / (2) No: ");
        reset = read.nextInt();

        switch (reset){
            case 1:
                Scanner read2 = new Scanner(System.in);
                System.out.print("Enter your new password: ");
                newPass = read2.nextLine();

                if (password.equals(newPass)){
                    System.out.println("Your new password cannot be the same as your old password.");
                } else {
                    System.out.println("Password has changed! ");
                    System.out.print("Have a nice day!");
                }
                break;
            case 2:
                System.out.println("Have a nice day!");
                break;
            default:
                System.out.println("Please enter 1 (Yes) or 2 (No).");
                break;
        }


    }
}
