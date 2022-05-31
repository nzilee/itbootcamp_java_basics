package p_23_5_2022.Exercise3;

public class BuyerCardProductMain {
    public static void main(String[] args) {

        MembershipCard card = new MembershipCard(10, "1234-5678");

        Buyer buyer = new Buyer("Nikola Zivkovic", card);

        Product product = new Product();

        product.setName("TV");
        product.setBuyer(buyer);
        product.setManufacturingPrice(238);
        String cardNumber = product.getBuyer().getCard().getCardNumber();

        product.print();

    }
}
