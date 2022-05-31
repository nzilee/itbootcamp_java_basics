package p_23_5_2022.Exercise3;

public class Buyer {

    private String fullName;
    private MembershipCard card;

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public MembershipCard getCard() {
        return card;
    }

    public Buyer(String fullName, MembershipCard card) {
        this.fullName = fullName;
        this.card = card;
    }

    public void print(){
        System.out.println(this.fullName + " - " + this.card.getCardNumber());
    }
}
