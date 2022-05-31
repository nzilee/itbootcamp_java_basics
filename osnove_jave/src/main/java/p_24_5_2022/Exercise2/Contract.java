package p_24_5_2022.Exercise2;

public class Contract {

    private String date;
    private IndividualEntity buyer;
    private IndividualEntity seller;
    private double realEstatePrice;
    private String address;

    public Contract(String date,
                    IndividualEntity buyer,
                    IndividualEntity seller,
                    double realEstatePrice,
                    String address) {
        this.date = date;
        this.buyer = buyer;
        this.seller = seller;
        this.realEstatePrice = realEstatePrice;
        this.address = address;
    }

    public double sellerRevenue(){
        return this.buyer.isHasBoughtThroughAgency() ? 0.02 : 0.03;
    }

    public double agencyRevenue (){
        return 1000 + this.realEstatePrice * sellerRevenue();
    }

    public void print(){
        System.out.println("Dana " + this.date + " godine, sklopljen je ugovor izmedju ");
        System.out.println(this.seller.getFullName() + " i " + this.buyer.getFullName() + " o kupovini nekretnine ");
        System.out.println(this.address + " po ceni od " + this.realEstatePrice + " pri cemi je kupac u obavezi da ");
        System.out.println("agenciji isplati novcanu vrednost u iznosu od " + this.agencyRevenue());

    }






}
