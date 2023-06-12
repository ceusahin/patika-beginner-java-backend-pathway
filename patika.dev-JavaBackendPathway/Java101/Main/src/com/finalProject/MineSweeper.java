package com.finalProject;

import java.util.Random;
import java.util.Scanner;

public class MineSweeper {
    int row;
    int col;
    int mineNum;
    int mineCount = 0;
    int inp1;
    int inp2;
    int rand1;
    int rand2;
    String[][] mineMap;
    String[][] gameMap;
    Scanner read = new Scanner(System.in);
    Random random = new Random();

    public MineSweeper(int row, int col){
        this.row = row;
        this.col = col;
        this.mineNum = Math.round((float) (this.row * this.col) / 4);
        this.gameMap = new String[row][col];
        this.mineMap = new String[row][col];
    }

    public void mainMaps(){
        for (int i = 0; i < this.row; i++){
            for (int j = 0; j < this.col; j++){
                this.mineMap[i][j] = "-";
                this.gameMap[i][j] = "-";
            }
        }
    }

    public void mineLocations(){
        for (int i = 0; i < this.mineNum; i++){
            rand1 = random.nextInt(this.row);
            rand2 = random.nextInt(this.col);
            if (!this.mineMap[rand1][rand2].equals("*")){
                this.mineMap[rand1][rand2] = "*";
            }
        }
    }

    public void printMineMap(){
        System.out.println("Mines location: ");
        mineLocations();

        for (int i = 0; i < this.row; i++){
            for (int j = 0; j < this.col; j++){
                if (!this.mineMap[i][j].equals("*")){
                    this.mineMap[i][j] = "-";
                }
                System.out.print(this.mineMap[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("=================================");
        System.out.println("Welcome to our Mine Sweeper Game!");
    }

    public void selectLocation(){
        while (true){
            System.out.println("==================================");
            System.out.print("Satir giriniz: ");
            inp1 = read.nextInt();
            System.out.print("Sutun giriniz: ");
            inp2 = read.nextInt();

            if ((inp1 < 0 || inp1 >= this.row) || (inp2 < 0 || inp2 >= this.col)){
                System.out.println("Oyun haritasi disinda secim yaptiniz. Lutfen tekrar giriniz.");
                continue;
            }

            if (this.mineMap[inp1][inp2].equals("*")){
                System.out.println("Oyunu kaybettiniz!");
                break;
            } else {
                for (int i = (inp1 - 1); i <= (inp1 + 1); i++){
                    for (int j = (inp2 - 1); j <= (inp2 + 1); j++){
                        if (i < 0 || j < 0 || i >= this.row || j >= this.col) {
                            continue;
                        }
                        if (this.mineMap[i][j].equals("*")){
                            mineCount++;
                        }
                    }
                }
                this.gameMap[inp1][inp2] = String.valueOf(mineCount);
                this.mineMap[inp1][inp2] = String.valueOf(mineCount);

                mineCount = 0;

                for (int i = 0; i < this.row; i++){
                    for (int j = 0; j < this.col; j++){
                        System.out.print(this.gameMap[i][j] + " ");
                    }
                    System.out.println();
                }
            }
            if (isFinish()){
                System.out.println("Tebrikler kazandiniz!");
                break;
            }

        }
    }

    public boolean isFinish(){
        for (int i = 0; i < this.row; i++){
            for (int j = 0; j < this.col; j++){
                if (this.mineMap[i][j].equals("-")){
                    return false;
                }
            }
        }
        return true;
    }

    public void run(){
        mainMaps();
        printMineMap();
        selectLocation();
    }
}