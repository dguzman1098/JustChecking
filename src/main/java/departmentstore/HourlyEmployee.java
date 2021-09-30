package departmentstore;

public class HourlyEmployee extends Employee implements Discountable {

    public HourlyEmployee() {
    }

    public HourlyEmployee(String name) {
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
