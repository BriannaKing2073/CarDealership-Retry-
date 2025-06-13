package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.regex.Pattern;

public class DealershipFileManager {

    public Dealership getDealership() {

        Dealership theDealership = null;
        Vehicle createdVehicle;

        try{

            FileReader fileReader = new FileReader("Dealership1File.csv");

            //read through every line in the file, and for each line create a dealership, and then
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String thisLine;

            if((thisLine = bufferedReader.readLine()) != null){

                theDealership = getDealershipFromEncodedString(thisLine);

                while ((thisLine = bufferedReader.readLine()) != null) {

                    // System.out.println(thisLine);

                    createdVehicle = getVehicleFromEncodedString(thisLine);

                    //this.inventory.add(createdVehicle);
                    theDealership.addVehicle(createdVehicle);

                }
            }
            bufferedReader.close();
        } catch (IOException e) {
            System.out.println("There was an error reading from the file.");
        }
        return theDealership;
    }

    private static Dealership getDealershipFromEncodedString(String encodedDealership) {

        String[] temp = encodedDealership.split(Pattern.quote("|"));

        String name = temp[0];
        String address = temp[1];
        String phone = temp[2];

        Dealership result = new Dealership(name,address,phone);
        return result;
    }

    private static Vehicle getVehicleFromEncodedString(String encodedVehicle){

        String[] temp = encodedVehicle.split(Pattern.quote("|"));

        int vin = Integer.parseInt(temp[0]);
        int year = Integer.parseInt(temp[1]);
        String make = temp[2];
        String model = temp[3];
        String vehicleType = temp[4];
        String color = temp[5];
        int odometer = Integer.parseInt(temp[6]);
        double vehiclePrice = Double.parseDouble(temp[7]);

        Vehicle result = new Vehicle(vin,year,make,model,vehicleType,color,odometer,vehiclePrice);
        return result;
    }

    public void saveDealership(Dealership theDealership){

        try {
            FileWriter writer = new FileWriter("Dealership1File.csv");

            writer.write(DealershipStringBuilder(theDealership));


            List<Vehicle> vehiclesToLoopThrough = theDealership.getAllVehicles();

            //now loop through each vehicle and write a line for that vehicle



           // writer.write(VehicleStringBuilder(vehicle));

            writer.close();
            System.out.println("Overwriting is Complete");

        } catch (IOException e) {
            System.out.println("Error Alert");
        }
    }

    private static String DealershipStringBuilder(Dealership theDealership){

        StringBuilder dealershipString = new StringBuilder();

        dealershipString.append(theDealership.getDealershipName() + " | " + theDealership.getDealershipAddress() + " | " + theDealership.getDealershipPhone());

        return dealershipString.toString();
    }

    private static String VehicleStringBuilder(Vehicle vehicle){

        StringBuilder vehicleString = new StringBuilder();

       vehicleString.append(vehicle.getVin() + " | " + vehicle.getYear() + " | " + vehicle.getMake() + " | " + vehicle.getModel() + " | " + vehicle.getVehicleType() + " | " + vehicle.getColor() + " | " + vehicle.getOdometer() + " | " + vehicle.getVehiclePrice());

        return vehicleString.toString();
    }
}
