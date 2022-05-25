package d_23_5_2022;

public class Scale {

    private String unit;
    private Product product;

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public double priceCalculation(double weight){
        if (this.unit.equals("kg")){
            return weight * product.getPricePerKg();
        } else if (this.unit.equals("lb")) {
            return weight * product.getPricePerLb();
        }
        return -1;
    }

    public void print(double weight){
        this.product.print();
        if (this.unit.equals("kg")) {
            System.out.println(this.product.getPricePerKg() + " RSD per " + this.unit + " x " + weight + "kg");
        } else if (this.unit.equals("lb")) {
            System.out.println(this.product.getPricePerLb() + " RSD per " + this.unit + " x " + weight + "kg");
        }
        System.out.println("Total: " + this.priceCalculation(weight) + " RSD");
    }

}
