package com.works;

public class Car {
    String modelName;
    int modelYear;
    String type;
    String color;
    int speed;
    int speedLimit;

    Car(String modelName, int modelYear, String type, String color) {
        this.modelName = modelName;
        this.modelYear = modelYear;
        this.type = type;
        this.color = color;
        this.speedLimit = 180;
    }

    Car(){

    }

    void increaseSpeed(int increment){
        if ((this.speed + increment) < this.speedLimit) {
            this.speed += increment;
        }
    }

    void decreaseSpeed(int decrease){
        if (this.speed > 0){
            this.speed -= decrease;
        }
    }

    void printSpeed(){
        System.out.println(modelName + " current speed: " + speed);
    }

    void printInfo() {
        System.out.println("Car model name: \t" + this.modelName);
        System.out.println("Car model year: \t" + this.modelYear);
        System.out.println("Car type: \t\t\t" + this.type);
        System.out.println("Car color: \t\t\t" + this.color);
    }
}