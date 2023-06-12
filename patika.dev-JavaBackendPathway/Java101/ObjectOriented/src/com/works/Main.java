package com.works;
// @author Hakan Sahin
public class Main {
    public static void main(String[] args) {
        Car bmw = new Car();
        Car audi = new Car();

        bmw.modelName = "BMW X5";
        bmw.modelYear = 2022;
        bmw.type = "Jeep";
        bmw.color = "Black";

        audi.modelName = "Audi A3";
        audi.modelYear = 2019;
        audi.type = "Hatchback";
        audi.color = "White";

        System.out.println(bmw.modelName);
        System.out.println(bmw.modelYear);
        System.out.println(bmw.type);
        System.out.println(bmw.color);

        System.out.println("- - - - - - - - - - - - - - - - - -");

        bmw.speed = 20;
        bmw.printSpeed();

        bmw.increaseSpeed(40);
        bmw.printSpeed();

        bmw.increaseSpeed(55);
        bmw.printSpeed();

        bmw.increaseSpeed(25);
        bmw.printSpeed();

        System.out.println("- - - - - - - - - - - - - - - - - -");

        // Constructor methods

        Car mercedes = new Car("Mercedes-Benz AMG GTR", 2023, "Fastback", "Gray");
        mercedes.printInfo();






    }
}
