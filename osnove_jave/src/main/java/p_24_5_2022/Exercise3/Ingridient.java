package p_24_5_2022.Exercise3;

public class Ingridient {

    private String name;
    private int price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Ingridient(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public void print(){
        System.out.println("Sastojak: " + this.name + " sa cenom: " + this.price);
    }


}
