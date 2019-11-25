package com.company;

public class Hangar {

    //Create a Hangar class that will have a main() method
    public static void main(String[] args) {
	// Add references to instances of the Car and Boat classes in the main() method of Hangar
        Car[] cars = {
            new Car(100, "Toyota"),
            new Car(5000, "BMW")
        };
        Boat[] boats= {
            new Boat(3000, "Lund"), new Boat(200, "Bertram")};
        //For each of the references, display the result of calling the doStuff() method in the terminal
        for (Car car: cars){
            System.out.println(car.doStuff());
        }
        for (Boat boat: boats){
            System.out.println(boat.doStuff());
        }
    }
}
