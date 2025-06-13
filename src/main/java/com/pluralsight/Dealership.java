package com.pluralsight;

import java.util.ArrayList;
import java.util.List;

public class Dealership {

    private String dealershipName;
    private String dealershipAddress;
    private String dealershipPhone;
    private ArrayList<Vehicle> inventory;

    //Constructor

    public Dealership(String dealershipName, String dealershipAddress, String dealershipPhone) {
        this.dealershipName = dealershipName;
        this.dealershipAddress = dealershipAddress;
        this.dealershipPhone = dealershipPhone;
        this.inventory = new ArrayList<>();
    }

    //Getters and Setters
    //name
    public String getDealershipName() {
        return dealershipName;
    }

    public void setDealershipName(String dealershipName) {
        this.dealershipName = dealershipName;
    }
    //address
    public String getDealershipAddress() {
        return dealershipAddress;
    }

    public void setDealershipAddress(String dealershipAddress) {
        this.dealershipAddress = dealershipAddress;
    }
    //phone
    public String getDealershipPhone() {
        return dealershipPhone;
    }

    public void setDealershipPhone(String dealershipPhone) {
        this.dealershipPhone = dealershipPhone;
    }
//////
///
public List<Vehicle> getAllVehicles(){
    return this.inventory;
}

//    public List<Vehicle> getAllVehicles(){
//        //all maybe add a sort by price or age
//        List<Vehicle> allVehicles = new ArrayList<>();
//        for(Vehicle vehicle : this.inventory){
//
//                allVehicles.add(vehicle);
//
//        }
//        return allVehicles;
//    }

    public void addVehicle(Vehicle vehicle){

        this.inventory.add(vehicle);

    }

    public List<Vehicle> getVehiclesByPrice(double minPrice, double maxPrice) {

        List<Vehicle> vehiclesByPrice = new ArrayList<>();
        for(Vehicle vehicle : this.inventory){
            if (vehicle.getVehiclePrice() >= minPrice && vehicle.getVehiclePrice() <= maxPrice){
                vehiclesByPrice.add(vehicle);
            }
        }
        return vehiclesByPrice;
    }

    public String getVehiclesByMakeModel(){
//        // make model
//        return vehiclesByMakeModel;
        return null;
    }
//
    public String getVehiclesByYear(){
//        //min max
//        return vehiclesByYear;
        return null;
    }

    public String getVehiclesByColor(){
//        //color
//        return vehiclesByColor;
        return null;
    }

    public String getVehiclesByMileage(){
//        //min max
//        return vehiclesByMileage;
        return null;
    }

    public String getVehiclesByType(){
//        //vechicle type
//        return vehiclesByType;
        return null;
    }
}
