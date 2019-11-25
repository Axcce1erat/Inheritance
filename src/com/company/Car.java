package com.company;
// Create a Car class that extends the Vehicle class
public class Car extends Vehicle{
    public Car(int kilometers, String brand) {
        super(kilometers, brand);
    }
    //Inside Car and Boat add an implementation of the body of the method doStuff(). For Car, you will need to refer back to:  "I am {brand} and I go zoom zoom zoom!"
    public String doStuff(){
        return "I am " + getBrand() + " and I go zoom zoom zoom!";
    }
}
