package com.kf;

import java.util.Scanner;

public class UserInterface {
    private Dealership dealership;
    private static Scanner scanner = new Scanner(System.in);


    public UserInterface() {
    }
    private void init() {
    this.dealership = new Dealership("", "", "");
    }

    public void display() {
        init();
        int userInput;

        do {
            System.out.println("");
            System.out.println("\t1 Get All Vehicles ");
            System.out.println("\t2 Get all Vehicles by Price ");
            System.out.println("\t3");
            System.out.println("\t4");
            System.out.println("\t5");
            System.out.println("\t6");
            System.out.println("\t7");
            System.out.println("\t8 Add a Vehicle");
            System.out.println("\t9 Remove a Vehicle");
            System.out.println("\t99 Exit");

            System.out.print(":");

            userInput = scanner.nextInt();
            switch (userInput) {
                case 1:
                    processGetAllVehiclesRequest();
                    break;
                case 2:
                    processGetVehiclesByPriceRequest();
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    processAddVehicleRequest();
                    break;
                case 9:
                    processRemoveVehicleRequest();
                    break;
                case 99:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Command not found. Please try again. :) ");

            }



        } while (userInput == 99);
    }

    public void processGetVehiclesByPriceRequest() {

    }

    public void processGetVehiclesByMakeModelRequest() {

    }

    public void processGetVehiclesByYearRequest() {

    }

    public void processGetVehiclesByColorRequest() {

    }

    public void processGetVehiclesByMileageRequest() {

    }

    public void processGetVehiclesByTypeRequest() {

    }

    public void processGetAllVehiclesRequest() {

    }

    public void processAddVehicleRequest(){

    }

    public void processRemoveVehicleRequest(){
        System.out.println("Removing Vehicle From Catalogue...");

    }
}
