package p_23_5_2022.Exercise3;

public class Product {

    private String name;
    private Buyer buyer;
    private double manufacturingPrice;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Buyer getBuyer() {
        return buyer;
    }

    public void setBuyer(Buyer buyer) {
        this.buyer = buyer;
    }

    public double getManufacturingPrice() {
        return manufacturingPrice;
    }

    public void setManufacturingPrice(int manufacturingPrice) {
        this.manufacturingPrice = manufacturingPrice;
    }


    public Product() {
    }

    public double productPrice(){
        return this.manufacturingPrice * 1.9 * (100 - this.buyer.getCard().getDiscount()) / 100;
    }

    public void print(){
        System.out.println(this.getName() + " - " + this.productPrice());
        System.out.println(this.buyer.getFullName() + " - " + this.buyer.getCard().getCardNumber());
    }
}
