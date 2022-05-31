package p_30_5_2022.Pasta;

public class SastojakPastaMain {
    public static void main(String[] args) {

        Sastojak meso = new Sastojak("Mleveno meso", 820);
        Sastojak pelat = new Sastojak("Pasirani paradajz", 285);
        Sastojak pene = new Sastojak("Pene", 150);
        Sastojak origano = new Sastojak("Origano", 15);

        Pasta bolognese = new Pasta();

        bolognese.dodajSastojak(meso);
        bolognese.dodajSastojak(pelat);
        bolognese.dodajSastojak(pene);
        bolognese.dodajSastojak(origano);

        bolognese.obrisiSastojak("Mleveno meso");

        bolognese.print();
        System.out.println("---------------------");
        bolognese.cenaSvihSastojaka();
    }
}
