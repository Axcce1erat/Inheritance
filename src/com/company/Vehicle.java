package com.company;

//Create an abstract class Vehicle
public abstract class Vehicle {

    //Add the attributes String brand and int kilometers.
    private int kilometers;
    private String brand;

    //Create a constructor to initialise brand and kilometers
    public Vehicle(int kilometers, String brand){
        this.brand = brand;
        this.kilometers = kilometers;
    }

    //Add getters and setters for all attributes
    public String getBrand(){return this.brand;}
    public int getKilometers(){return this.kilometers;}

    public void setBrand(String brand){this.brand = brand;}
    public void setKilometers(int kilometers){this.kilometers = kilometers;}

    // Inside Vehicle add the abstract method public String doStuff()
    public String doStuff(){
        return brand;
    }
}
