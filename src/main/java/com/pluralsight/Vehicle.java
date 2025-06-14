package com.pluralsight;

public class Vehicle {

    private int vin;
    private int year;
    private String make;
    private String model;
    private String vehicleType;
    private String color;
    private int odometer;
    private double vehiclePrice;

    //Constructor
    public Vehicle(int vin, int year, String make, String model, String vehicleType, String color, int odometer, double vehiclePrice) {
        this.vin = vin;
        this.year = year;
        this.make = make;
        this.model = model;
        this.vehicleType = vehicleType;
        this.color = color;
        this.odometer = odometer;
        this.vehiclePrice = vehiclePrice;
    }

    //Getters and Setters
    //Vin
    public int getVin() {
        return vin;
    }

    public void setVin(int vin) {
        this.vin = vin;
    }
    //year
    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    //Make
    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }
    //Model
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
    //vehicle type
    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }
    //color
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    //odometer
    public int getOdometer() {
        return odometer;
    }

    public void setOdometer(int odometer) {
        this.odometer = odometer;
    }
    //price
    public double getVehiclePrice() {
        return vehiclePrice;
    }

    public void setVehiclePrice(double vehiclePrice) {
        this.vehiclePrice = vehiclePrice;
    }
}
