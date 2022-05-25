package d_23_5_2022;

public class ProductScaleMain {
    public static void main(String[] args) {

        Product banana = new Product(13213213,
                "Banana",
                150);

        Scale kg = new Scale();

        kg.setUnit("kg");
        kg.setProduct(banana);

        kg.print(2);

        System.out.println("--------------------------------");

        Scale lb = new Scale();

        lb.setUnit("lb");
        lb.setProduct(banana);

        lb.print(2);

        System.out.println("--------------------------------");

        Product chocolate = new Product(54321, "Chocolate Bar", 1200);

        kg.setUnit("kg");
        kg.setProduct(chocolate);

        kg.print(0.3);

        System.out.println("--------------------------------");

        lb.setUnit("lb");
        lb.setProduct(chocolate);

        lb.print(0.3);
    }
}
