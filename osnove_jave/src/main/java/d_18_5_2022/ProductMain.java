package d_18_5_2022;

public class ProductMain {
    public static void main(String[] args) {

        Product chocolateBar = new Product();

        chocolateBar.name = "Chocolate Bar";
        chocolateBar.price = 1.5;
        chocolateBar.weightInGrams = 320;

        chocolateBar.print();

        System.out.println();

        Product coffeeBeans = new Product();

        coffeeBeans.name = "Bag of coffee beans";
        coffeeBeans.price = 55.89;
        coffeeBeans.weightInGrams = 900;

        coffeeBeans.print();

        System.out.println();

        Product milkshake = new Product();

        milkshake.name = "Cup of milkshake";
        milkshake.price = 19.99;
        milkshake.weightInGrams = 152.3;

        milkshake.print();
    }
}
