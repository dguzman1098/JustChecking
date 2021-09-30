package departmentstore;

import java.util.Arrays;

public class Customer extends Person {

    private Clothing[] clothingItems;
    private char size;

    public Customer(){
    }

    public Customer(String name){
        super(name);
    }

    public Customer(String name, char size) {
        super(name);
        this.size = size;
    }

    public char getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "clothingItems=" + Arrays.toString(clothingItems) +
                '}';
    }
}
