package departmentstore;

import java.util.Comparator;

public class Clothing implements Discountable {
    private String description;
    private double price;
    private char size;
    private double discount;

    public Clothing(){

    }

    public Clothing(String description, double price, double discount, char size) {
        this.description = description;
        this.price = price;
        this.discount = discount;
        this.size = size;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public char getSize() {
        return size;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    @Override
    public String toString() {
        return  "description='" + description +
                ", price=$" + price;
    }

    @Override
    public double calcDiscount(Clothing clothes) {
        return clothes.getPrice() * getDiscount();
    }

}

