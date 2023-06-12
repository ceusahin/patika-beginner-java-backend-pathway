package com.practices;

import java.util.Scanner;

public class AtmProject {
    public static void main(String[] args) {
        String userName, password, dbUserName = "patika", dbPassword = "kodluyoruz";
        int balance = 1500, wrongInfos = 0, action, deposit, withdraw, leftAttempt = 4;
        Scanner read = new Scanner(System.in);

        while (wrongInfos < 4){
            System.out.print("Enter your username: ");
            userName = read.nextLine();
            System.out.print("Enter your password: ");
            password = read.nextLine();

            if (userName.contentEquals(dbUserName) && password.contentEquals(dbPassword)){
                System.out.println("Successfully logged in! Welcome CEUBANK.\nPlease choose action.");

                do {
                    System.out.println("1- Deposit money\n2- Withdraw money\n3- Check balance\n4- Quit\n");
                    action = read.nextInt();

                    switch (action) {
                        case 1:
                            System.out.print("How much will you deposit? --> ");
                            deposit = read.nextInt();
                            balance += deposit;
                            break;
                        case 2:
                            System.out.print("How much will u withdraw? --> ");
                            withdraw = read.nextInt();
                            if (withdraw > balance){
                                System.out.print("Insufficient balance!\n");
                            } else {
                                balance -= withdraw;
                            }
                            break;
                        case 3:
                            System.out.println("You have " + balance + " USD.\n");
                            break;
                        case 4:
                            System.out.println("\nThank you for using CEUBANK service!\nWish you see again!");
                            wrongInfos = 4;
                            break;
                        default:
                            System.out.println("Please choose 1-4 actions.");
                            break;
                    }
                } while (action != 4);

            } else {
                wrongInfos++;
                System.out.println("Wrong username or password!");

                if (wrongInfos == 4){
                    System.out.print("Your bank account blocked. Please contact CEUBANK HR.");
                } else {
                    leftAttempt--;
                    System.out.println("You have " + leftAttempt + " attempts.\n");
                }
            }
        }



    }
}
