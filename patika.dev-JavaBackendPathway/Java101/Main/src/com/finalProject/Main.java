package com.finalProject;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int row, col;

        System.out.print("Satir sayisi: ");
        row = read.nextInt();
        System.out.print("Sutun sayisi: ");
        col = read.nextInt();

        MineSweeper mineSweeper = new MineSweeper(row,col);
        mineSweeper.run();
    }
}
