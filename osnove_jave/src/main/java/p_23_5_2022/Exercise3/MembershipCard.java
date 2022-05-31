package p_23_5_2022.Exercise3;

public class MembershipCard {

    private int discount;
    private String cardNumber;

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public MembershipCard (int discount, String cardNumber){
        this.discount = discount;
        this.cardNumber = cardNumber;
    }
}
