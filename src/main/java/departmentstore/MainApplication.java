package departmentstore;

import java.util.ArrayList;

public class MainApplication {

    public static void main(String[] args) {

        Clothing[] clothesList = new Clothing[3];
        ArrayList<Clothing> clothesArray = new ArrayList<>();
        Discountable[] discountableClothes = new Discountable[3];

        Customer customer = new Customer("Diego",'M');
        HourlyEmployee hourlyEmployee = new HourlyEmployee("Joe");

        Clothing blueShirt = new Clothing("blue shirt", 15.00, .10, 'M' );
        Clothing redShirt = new Clothing("red shirt", 20.00, .15, 'L' );
        Clothing greenShirt = new Clothing("green shirt", 18.00, .40, 'S' );

        clothesList[0] = blueShirt;
        clothesList[1] = redShirt;
        clothesList[2] = greenShirt;

        clothesArray.add(blueShirt);
        clothesArray.add(redShirt);
        clothesArray.add(greenShirt);

        discountableClothes[0] = blueShirt;
        discountableClothes[1] = redShirt;
        discountableClothes[2] = greenShirt;


        System.out.println("Total: $" + ShopApp.calcTotal(clothesList));

        System.out.println("Shirt fits customer: " + ShopApp.isAFit(customer, redShirt));

        ShopApp.sortAndPrintClothingByPrice(clothesArray);

        ShopApp.printEmployeeName(hourlyEmployee);

        ShopApp.printDiscAmtOff(discountableClothes, blueShirt);

        System.out.println(" ");

        hourlyEmployee.printEmpPriceAfterDisc(blueShirt);



    }
}
