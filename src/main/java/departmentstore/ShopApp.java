package departmentstore;

import java.util.*;

public class ShopApp {

    public static double calcTotal(Clothing[] clothes){
        double total = 0.0;
        for (Clothing item : clothes){
            total += item.getPrice();
        }
        return total;
    }

    public static boolean isAFit(Customer customer, Clothing item){
        if(customer.getSize() == item.getSize()){
            return true;
        } else{
            return false;
        }
    }

    public static void sortAndPrintClothingByPrice(ArrayList<Clothing> clothes){
        System.out.print("Clothing Sorted By Price: ");
        Collections.sort(clothes, (item1, item2) -> (int) (item1.getPrice() - item2.getPrice())); // lambda resource https://mkyong.com/java8/java-8-lambda-comparator-example/
        System.out.println(clothes);
    }

    public static void printEmployeeName(Employee employee){
        System.out.println("Employee Name: " + employee.getName());
    }

    public static void printDiscAmtOff(Discountable[] discountable, Clothing clothes) {
        for (int i = 0; i < discountable.length; i++) {
            if (discountable[i].equals(clothes)) {
                System.out.printf("This item is $%.2f off", clothes.calcDiscount(clothes));
            }
        }
    }
}
