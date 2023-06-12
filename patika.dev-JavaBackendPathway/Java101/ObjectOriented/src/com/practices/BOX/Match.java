package com.practices.BOX;

public class Match {
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;
    int startChance;

    Match(Fighter f1, Fighter f2, int minWeight, int maxWeight){
        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
        this.startChance = 50;
    }

    boolean isCheck(){
        return (this.f1.weight >= minWeight && this.f1.weight <= maxWeight) && (this.f2.weight >= minWeight && this.f2.weight <= maxWeight);
    }

    public void run(){
        if(isCheck()){
            if (whoStart()){
                while (this.f1.health > 0 && this.f2.health > 0){
                    System.out.println("===== NEW ROUND =====");

                    this.f2.health = this.f1.hit(f2);
                    if (isWin()){
                        break;
                    }

                    this.f1.health = this.f2.hit(f1);
                    if (isWin()){
                        break;
                    }

                    System.out.println(this.f1.name + " HP: " + this.f1.health + "\n" + this.f2.name + " HP: " + this.f2.health + "\n");
                }
            } else {
                while (this.f1.health > 0 && this.f2.health > 0){
                    System.out.println("===== NEW ROUND =====");

                    this.f1.health = this.f2.hit(f1);
                    if (isWin()){
                        break;
                    }

                    this.f2.health = this.f1.hit(f2);
                    if (isWin()){
                        break;
                    }

                    System.out.println(this.f2.name + " HP: " + this.f2.health + "\n" + this.f1.name + " HP: " + this.f1.health + "\n");
                }
            }
        } else {
            System.out.println("Siklet uyumsuzlugu!");
        }
    }

    boolean isWin(){
        if (this.f1.health == 0){
            System.out.println("Winner: " + this.f2.name);
            return true;
        }

        if (this.f2.health == 0){
            System.out.println("Winner: " + this.f1.name);
            return true;
        }
        return false;
    }

    boolean whoStart(){
        double randomNumber = Math.random() * 100.0;
        return randomNumber <= startChance;
    }
}
