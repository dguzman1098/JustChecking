package departmentstore;

public abstract class Employee extends Customer {

    private final double discount = 0.15;

    public Employee(){

    }

    public Employee(String name) {
        super(name);
    }


    public double getDiscount() {
        return discount;
    }

    public abstract void printEmpPriceAfterDisc(Clothing clothes);
}
