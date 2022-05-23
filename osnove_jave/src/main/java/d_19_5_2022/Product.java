package d_19_5_2022;

public class Product {

    public String name;
    public double price;
    public double weightInGrams;

    public void print(){
        System.out.println(this.name + ", " + this.price + ", " + this.weightInGrams);
    }

    public void priceUp(double priceIncrease){
        this.price = this.price + priceIncrease;
    }

    public double returnPriceWithDiscount(double discount){
        return  this.price - (this.price * (discount / 100));
    }

    public int shippingIncluded(){
        if (this.weightInGrams <= 100){
            return 200;
        }
        if (this.weightInGrams > 100 && this.weightInGrams <= 500){
            return 400;
        }
        if (this.weightInGrams > 500){
            return 1000;
        }
        return -1;
    }
}
