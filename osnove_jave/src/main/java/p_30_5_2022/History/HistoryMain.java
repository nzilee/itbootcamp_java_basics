package p_30_5_2022.History;

public class HistoryMain {
    public static void main(String[] args) {

        HistoryPage google = new HistoryPage("google",
                "google.com",
                18,
                25);

        google.sacuvajKredencijale("nikola", "1234");

        HistoryPage fb = new HistoryPage("Facebook",
                "facebook.com",
                21,
                21);

        HistoryPage yt = new HistoryPage("YouTube",
                "youtube.com",
                13,
                47);

        History i = new History();

        i.otvoriStranicu(google);
        i.otvoriStranicu(fb);
        i.otvoriStranicu(yt);

        i.obrisiPremaLinku("facebook.com");

        i.obrisiKolaciceZaLink("google.com");

        i.sacuvajKredencijale("YouTube", "n123n", "12345");

        i.pogledajIstoriju();


    }
}
