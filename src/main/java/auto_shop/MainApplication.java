package auto_shop;

import java.util.ArrayList;
import java.util.Collections;

public class MainApplication {

    public static void main(String[] args) {

        ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>(); // stores Vehicle Objects in an Arraylist
        ArrayList<Driveable> driveable = new ArrayList<Driveable>(); // stores Driveable Objects in an ArrayList

        Engine carEngine = new Engine("carEngine");
        Engine truckEngine = new Engine("truckEngine");
        Engine bikeEngine = new Engine("motorBike");

        Car car = new Car("Honda", 50, 120, carEngine);
        Truck truck = new Truck("GM", 100, 110, truckEngine);
        MotorBike motorBike = new MotorBike("Suzuki", 75, 95, bikeEngine);

        // added vehicles
        vehicles.add(car);
        vehicles.add(truck);
        vehicles.add(motorBike);

        //added driveable vehicles
        driveable.add(truck);
        driveable.add(motorBike);


        //output
        CarApp.printVehicleNamesAndPrices(vehicles);
        System.out.println(" - - - - - - - - - - - - - - - ");
        System.out.println("Driveable Vehicles");
        for (Driveable vehicle : driveable){
            System.out.println(vehicle.getClass().getSimpleName()  + " Speed:");
            System.out.println(vehicle.calcSpeed());
        }

        System.out.println(" - - - - - - - - - - - - - - - ");
        System.out.println("Car Payment");
        System.out.println("Before Tax $"+CarApp.totalBeforeTax(car));
        System.out.println("After Tax $"+CarApp.totalAfterTax(car));
        System.out.println(" - - - - - - - - - - - - - - - ");
        System.out.println("Truck Payment");
        System.out.println("Before Tax $"+CarApp.totalBeforeTax(truck));
        System.out.println("After Tax $"+CarApp.totalAfterTax(truck));
        System.out.println(" - - - - - - - - - - - - - - - ");
        CarApp.sortPrintDriveablesBySpeed(driveable);



    }


}
