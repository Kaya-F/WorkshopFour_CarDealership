package com.kf;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Dealership {
    private ArrayList<Vehicle> inventory;
    private static Scanner scanner = new Scanner(System.in);
    private String name;
    private String address;
    private String phone;

    public Dealership(String name, String address, String phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.inventory = new ArrayList<>();
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public ArrayList<Vehicle> getAllVehicles(){
        return null;
    }
    public ArrayList<Vehicle> getVehiclesByPrice(int min, int max){
        return null;
    }
    public ArrayList<Vehicle> getVehiclesByMakeModel(String make, String model){
        return null;
    }
    public ArrayList<Vehicle> getVehiclesByYear(int min, int max){
        return null;
    }
    public ArrayList<Vehicle> getVehiclesByColor(String color){
        return null;
    }
    public ArrayList<Vehicle> getVehiclesByType(String vehicleType){
        return null;
    }

    public void addVehicle(Vehicle vehicle){
        String yesOrNo;

        System.out.println("Car Information");

        System.out.print("VIN (Vehicle Identification Number):");
        int vin  = scanner.nextInt();

        System.out.print("Year:");
        int year = scanner.nextInt();

        System.out.print("Make:");
        String make = scanner.nextLine();

        System.out.print("Model:");
        String model = scanner.nextLine();

        System.out.print("Vehicle Type:");
        String vehicleType = scanner.nextLine();

        System.out.print("Color:");
        String color = scanner.nextLine();

        System.out.print("Odometer:");
        int odometer = scanner.nextInt();

        System.out.print("Price:");
        double price = scanner.nextDouble();

        Vehicle newVehicle = new Vehicle(vin, year, make, model, vehicleType, color, odometer, price);
        this.inventory.add(newVehicle);

        try{
            FileWriter fileWriter = new FileWriter("./src/main/java/com/kf/inventory.txt");
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write("\n" + vin + "|" + year + "|" + model + "|" + vehicleType + "|" + color + "|" + odometer + "|" + price);
            System.out.println("Vehicle Added:" + "\n" + vin + "|" + year + "|" + model + "|" + vehicleType + "|" + color + "|" + odometer + "|" + price);

            bufferedWriter.close();
        } catch (IOException e) {
            System.out.println("Unsuccessful adding of new vehicle.");
            e.printStackTrace();
        }
        scanner.close();
    }
    public void removeVehicle(Vehicle vehicle){
    }
//    public static void loadFromInventory(){
//
//        try {
//            FileReader inventoryFile = new FileReader("./src/main/java/com/kf/inventory.txt");
//            BufferedReader bufferedReader = new BufferedReader(inventoryFile);
//
//            String input;
//
//            while ((input = bufferedReader.readLine())!= null){
//                String[] splitInput = input.split("|");
//                int vehicleVinInput = Integer.parseInt(splitInput[0]);
//                int vehicleYearInput = Integer.parseInt(splitInput[1]);
//                String vehicleMakeInput = splitInput[2];
//                String vehicleModelInput = splitInput[3];
//                String vehicleTypeInput = splitInput[4];
//                String vehicleColorInput = splitInput[5];
//                int vehicleOdometerInput = Integer.parseInt(splitInput[6]);
//                double vehiclePriceInput = Double.parseDouble(splitInput[7]);
//
//                Vehicle currentVehicle = new Vehicle(vehicleVinInput, vehicleYearInput, vehicleMakeInput, vehicleModelInput, vehicleTypeInput, vehicleColorInput, vehicleOdometerInput, vehiclePriceInput);
//                inventory.add(currentVehicle);
//            }
//            bufferedReader.close();
//        } catch(IOException e){
//            System.out.println("ERROR: Files cannot be loaded");
//            e.printStackTrace();
//        }
//
//    }

}
