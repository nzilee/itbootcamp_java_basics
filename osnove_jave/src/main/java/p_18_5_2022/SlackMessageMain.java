package p_18_5_2022;

public class SlackMessageMain {
    public static void main(String[] args) {

        SlackMessage nikolinaPoruka = new SlackMessage();

        nikolinaPoruka.tekst = "Hello World";
        nikolinaPoruka.korisnik = "Nikola_zz";
        nikolinaPoruka.datumIVreme = "18.5.2022. 20:35";

        SlackMessage markovaPoruka = new SlackMessage();

        markovaPoruka.tekst = "Hello Universe";
        markovaPoruka.korisnik = "123_Marko_123";
        markovaPoruka.datumIVreme = "12.5.2022. 00:52";

        System.out.println(nikolinaPoruka.korisnik + " - " + nikolinaPoruka.datumIVreme);
        System.out.println(nikolinaPoruka.tekst);

        System.out.println();

        System.out.println(markovaPoruka.korisnik + " - " + markovaPoruka.datumIVreme);
        System.out.println(markovaPoruka.tekst);


    }
}
