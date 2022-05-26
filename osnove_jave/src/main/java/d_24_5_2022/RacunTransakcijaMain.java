package d_24_5_2022;

public class RacunTransakcijaMain {
    public static void main(String[] args) {

        Racun salje = new Racun("160-4838-60",
                "Nikola Zivkovic",
                10000);



        Racun prima = new Racun("160-3434-52",
                "Jovan Jovanovic",
                1500);



        Transakcija nova = new Transakcija(1234, salje, prima);

        nova.izvrsiTransakciju(5500);

        nova.print();
    }
}
