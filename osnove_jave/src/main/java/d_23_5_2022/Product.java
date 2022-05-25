package d_23_5_2022;

public class Product {

    private int ID;
    private String name;
    private double pricePerKg;

    public Product(int ID, String name, double pricePerKg) {
        this.ID = ID;
        this.name = name;
        this.pricePerKg = pricePerKg;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPricePerKg(double pricePerKg) {
        this.pricePerKg = pricePerKg;
    }

    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public double getPricePerKg(){
        return pricePerKg;
    }

    public double getPricePerLb(){
        return pricePerKg * 0.45;
    }

    public void print(){
        System.out.println(this.ID + " - " + this.name);
    }
}
