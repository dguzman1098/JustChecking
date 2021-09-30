package departmentstore;

public class Manager extends Employee implements Discountable {

    public Manager() {
    }

    public Manager(String name) {
        super(name);
    }

    @Override
    public double calcDiscount(Clothing clothes) {
       return clothes.getPrice() * getDiscount();
    }

    @Override
    public void printEmpPriceAfterDisc(Clothing clothes) {
        double discount = clothes.getPrice() * getDiscount();
        System.out.println("Final price: $" + (clothes.getPrice() - discount));
    }
}
