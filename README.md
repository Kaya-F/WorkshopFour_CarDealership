# WorkshopFour_CarDealership

relationships/coupling:
User Interface -> Dealership -> Vehicle

### UserInterface

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
