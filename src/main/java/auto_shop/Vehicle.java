package auto_shop;

import java.util.Comparator;

//    https://www.tutorialspoint.com/java/java_using_comparator.htm
//  ^^^ Source I used for how to implement a Comparator interface ^^^

public abstract class Vehicle implements Driveable {

    private String name;
    private Engine engine;
    private double speed;
    private double tax = 0.15;
    private double price;

    public Vehicle(String name, double price, double speed, Engine engine){
        this.name = name;
        this.price = price;
        this.speed = speed;
        this.engine = engine;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    @Override
    public double calcSpeed() {
        return getSpeed();
    }

    @Override
    public String toString() {
        return getName() + " : " + getSpeed();
    }

}
