package d_19_5_2022;

public class ProductMain {
    public static void main(String[] args) {

        Product laptop = new Product();

        laptop.name = "MacBook Air 13 2021";
        laptop.price = 119999.99;
        laptop.weightInGrams = 1250;

        laptop.print();

        laptop.priceUp(2500);
        System.out.println("New price after price increasment is " + laptop.price);

        double discount = laptop.returnPriceWithDiscount(33);
        System.out.println("Price after the discount is " + discount);

        System.out.println("The shipping for ordered product is: " + laptop.shippingIncluded() +
                ". Total is: " + (laptop.price + laptop.shippingIncluded()));

        System.out.println();

        Product sneakers = new Product();

        sneakers.name = "Nike AirMax 1";
        sneakers.price = 15999.99;
        sneakers.weightInGrams = 396.89;

        sneakers.print();

        sneakers.priceUp(4000.01);
        System.out.println("New price after price increasment is " + sneakers.price);

        discount = sneakers.returnPriceWithDiscount(25);
        System.out.println("Price after the discount is " + discount);

        System.out.println("The shipping for ordered product is: " + sneakers.shippingIncluded() +
                ". Total is: " + (sneakers.price + sneakers.shippingIncluded()));

        System.out.println();

        Product videoGame = new Product();

        videoGame.name = "Red Dead Redemption 2";
        videoGame.price = 6229.99;
        videoGame.weightInGrams = 88;

        videoGame.print();

        videoGame.priceUp(1000);
        System.out.println("New price after price increasment is " + videoGame.price);

        discount = videoGame.returnPriceWithDiscount(83);
        System.out.println("Price after the discount is " + discount);

        System.out.println("The shipping for ordered product is: " + videoGame.shippingIncluded() +
                ". Total is: " + (videoGame.price + videoGame.shippingIncluded()));

    }
}
