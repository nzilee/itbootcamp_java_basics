package p_24_5_2022.Exercise2;

public class IndividualEntityContractMain {
    public static void main(String[] args) {

    IndividualEntity kupac = new IndividualEntity("Nikola Zivkovic",
            "1234",
            "31313131");

    kupac.setHasBoughtThroughAgency(false);


    IndividualEntity prodavac = new IndividualEntity("Marko Markovic",
            "4321",
            "43433434");

    Contract ugovor = new Contract("12.3.2020.",
            kupac, prodavac,
            250000,
            "Vozdova 21");

    ugovor.print();

    }
}
