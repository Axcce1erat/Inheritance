package com.company;
// Create a Boat class that also extends the Vehicle class
public class Boat extends Vehicle {
    public Boat(int kilometers, String brand) {
        super(kilometers, brand);
    }
    // Inside Car and Boat add an implementation of the body of the method doStuff(). For Boat: "I am {brand} and I go glug glug!"
    public String doStuff(){
        return "I am " + getBrand() + " and I go glug glug!";
    }
}
