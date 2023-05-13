# WorkshopFour_CarDealership

relationships/coupling:
User Interface -> Dealership -> Vehicle

### UserInterface
```
 int userInput;
        do{
            System.out.println("");
            System.out.println("\t1");
            System.out.println("\t2");
            System.out.println("\t3");
            System.out.println("\t4");
            System.out.println("\t5");
            System.out.println("\t6");
            System.out.println("\t7");
            System.out.println("\t8");
            System.out.println("\t9");
            System.out.println("\t99");

            System.out.print(":");

            userInput = scanner.nextInt();
            switch (userInput) {
                case 1:
                    break;
                case 2:
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
                case 9:
                    break;
                case 99:
                    break;
                default:


            }


        } while (userInput != 99);


```
### Dealership
  will hold information about the dealership abd maintain a lisst of vehicles. 
  it will also have the methods that search the list for matching vehicles as well as add/remove vehicles.
 ```
//private variables
  private String name;
  private String address;
  private String phone;
///
private ArrayList<Vehicle> vehicles;
```
### Vehicle
  will hold information about a specific vehicle. 
```
//private variables
  private int vin;
  private int year;
  private String make;
  private String model;
  private String vehicleType:
  private String color;
  private int odometer;
  private double price;
  ///
  ```
### DealershipFileManager
```
A derived getter for the Dealership?
```
