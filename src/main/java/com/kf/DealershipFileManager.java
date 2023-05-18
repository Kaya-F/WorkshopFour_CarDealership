package com.kf;

import java.io.*;
import java.util.Scanner;
import java.util.regex.Pattern;

public class DealershipFileManager {

    public Dealership getDealership() {

        try {
            FileInputStream dealershipFile = new FileInputStream("./src/main/java/com/kf/inventory.txt");
            Scanner scanner = new Scanner(dealershipFile);

            String firstLine_dealershipData = scanner.nextLine();
            String[] dealershipDataArray = firstLine_dealershipData.split(Pattern.quote("|"));
            System.out.println("Dealership Data: " + firstLine_dealershipData);


//            String vehicleData;
//            while (scanner.hasNextLine()) {
//                vehicleData = scanner.nextLine();
//                System.out.println("Vehicle: " + vehicleData);
//            }

            scanner.close();
            return new Dealership("", "", "");

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public void saveDealership(Dealership dealership) {
        // Write dealership information to an external file
    }
}

