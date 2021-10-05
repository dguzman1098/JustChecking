package auto_shop;

import java.util.*;

public class CarApp {

    public static void printVehicleNamesAndPrices(ArrayList<Vehicle> vehicles){
        for (Vehicle vehicle : vehicles){
            System.out.print(vehicle.getName() + " : " + "$" + vehicle.getPrice() + "\n");
        }
    }

    public static double totalBeforeTax(Vehicle vehicle){
        return vehicle.getPrice();
    }

    public static double totalAfterTax(Vehicle vehicle){
        double tax = vehicle.getPrice() * vehicle.getTax();
        if (vehicle instanceof Truck){
            vehicle.setTax(0.20);
            tax = vehicle.getPrice() * vehicle.getTax();
        }
       return (vehicle.getPrice() + tax);
    }

    public static void sortPrintDriveablesBySpeed(ArrayList<Driveable> driveables) {
        System.out.print("Driveable Vehicles By Speed: ");
        Collections.sort(driveables, (item1, item2) -> (int) (item1.calcSpeed() - item2.calcSpeed())); // lambda resource https://mkyong.com/java8/java-8-lambda-comparator-example/
        System.out.println(driveables);
        }


}

