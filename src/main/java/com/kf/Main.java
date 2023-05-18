package com.kf;

import java.io.*;

public class Main {
    public static void main(String[] args) {

        loadFromInventory();
        UserInterface userInterface = new UserInterface();
        userInterface.display();

    }

    public static void loadFromInventory(){

        try {
            FileReader inventoryFile = new FileReader("./src/main/java/com/kf/inventory.txt");
            BufferedReader bufferedReader = new BufferedReader(inventoryFile);

            String input;

            while ((input = bufferedReader.readLine())!= null){
                String[] splitInput = input.split("|");
                 int vehicleVinInput = Integer.parseInt(splitInput[0]);
                 int vehicleYearInput = Integer.parseInt(splitInput[1]);
                 String vehicleMakeInput = splitInput[2];
                 String vehicleModelInput = splitInput[3];
                 String vehicleTypeInput = splitInput[4];
                 String vehicleColorInput = splitInput[5];
                 int vehicleOdometerInput = Integer.parseInt(splitInput[6]);
                 double vehiclePriceInput = Double.parseDouble(splitInput[7]);

                 Vehicle currentVehicle = new Vehicle(vehicleVinInput, vehicleYearInput, vehicleMakeInput, vehicleModelInput, vehicleTypeInput, vehicleColorInput, vehicleOdometerInput, vehiclePriceInput);
                 inventory.add(currentVehicle);
            }
            bufferedReader.close();
        } catch(IOException e){
            System.out.println("ERROR: Files cannot be loaded");
            e.printStackTrace();
        }

    }
}