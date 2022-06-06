package DrugiJavaTest;

import java.util.ArrayList;

public class InstagramStoryMain {
    public static void main(String[] args) {

        ArrayList<InstagramAddOn> dodaci = new ArrayList<>();
        ArrayList<InstagramUser> users = new ArrayList<>();

        ///// Potencijalni autor storija
        InstagramUser nikola = new InstagramUser("nikola_123",
                "Nikola Zivkovic");

        ///// Potencijalni tagovani korisnici
        InstagramUser mladen = new InstagramUser("1_mladen_1",
                "Mladen Milic");
        InstagramUser jovan = new InstagramUser("joca.coja",
                "Jovan Jovanovic");
        InstagramUser stefan = new InstagramUser("ste_f_ke",
                "Stefan Filipovic");

        ///// Potencijalni pregledaci storija
        InstagramUser milan = new InstagramUser("milan.che",
                "Milan Stefanovic");
        InstagramUser ivan = new InstagramUser("i_va_n_iv",
                "Ivan Ivkovic");
        InstagramUser dragan = new InstagramUser("dr.agan",
                "Dragan Stevic");

        ///// Potencijalna lokacija storija
        InstagramLocationAddOn lokacija = new InstagramLocationAddOn(234, 20, 35,
                130, 120, "Niska Tvrdjava");
        InstagramLocationAddOn lokacija1 = new InstagramLocationAddOn(879, 25, 45,
                180, 100, "Kod konja"); //// Dodatak koji se kasnije brise

        lokacija.povecanjeDimenzija(5,80);      ////Povecanje dimenzija dodatka


        InstagramMentionAddOn tag = new InstagramMentionAddOn(567, 12, 35,
                90, 55);
        InstagramMentionAddOn tag2 = new InstagramMentionAddOn(661, 20, 15,
                120, 62);
        InstagramMentionAddOn tag3 = new InstagramMentionAddOn(716, 30, 45,
                132, 80);

        tag.povecanjeDimenzija(20, 30);       ////Povecanje dimenzija dodatka
        tag2.smanjenjeDimenzija(3,43);        ////Smanjenje dimenzija dodatka

        tag.setTagovan(mladen);   ////Tagovanje korisnika
        tag2.setTagovan(jovan);   ////Tagovanje korisnika
        tag3.setTagovan(stefan);  ////Tagovanje korisnika


        InstagramStory story = new InstagramStory(nikola,
                "https://www.instagram.com/p/CecrcPyrPMj/",
                dodaci, users);

        ////Dodavanje dodataka u niz dodataka
        story.dodajDodatak(lokacija);
        story.dodajDodatak(lokacija1);
        story.dodajDodatak(tag);
        story.dodajDodatak(tag2);
        story.dodajDodatak(tag3);

        ////Brisanje dodatka
        story.obrisiDodatak(879);

        ////Ubacivanje korisnika u niz korisnika koji su pregledali story
        story.pogledajStory(milan);
        story.pogledajStory(ivan);
        story.pogledajStory(dragan);
        /// duplo gledanje storija (ne ubacuje ga u "korisniciKojiSuPregledali")
        story.pogledajStory(dragan);


        story.postavljanjeStorija();
        System.out.println();
        story.korisniciKojiSuPregledali();

        System.out.println();
        System.out.println("********************STORY SA********************");
        //////////////////////////// STORY SA SWIPE UP ////////////////////////////
        System.out.println("********************SWIPE UP********************");
        System.out.println();


        ArrayList<InstagramAddOn> dodaci1 = new ArrayList<>();
        ArrayList<InstagramUser> users1 = new ArrayList<>();

        InstagramStory swipe = new InstagramStory(ivan,
                "https://www.instagram.com/p/CecrcPmnUYdhK/",
                dodaci1, users1);

        ////Setovanje swipe up linka
        swipe.setSwipeUpLink("https://rs.n1info.com");

        InstagramLocationAddOn lokacija3 = new InstagramLocationAddOn(111, 14, 40,
                130, 160, "Delta Planet Nis");

        lokacija3.smanjenjeDimenzija(90, 113);

        swipe.dodajDodatak(lokacija3);

        ////Stavio sam 2 u tagovane da bi bilo drugacije od gornjeg storija
        swipe.dodajDodatak(tag2);
        swipe.dodajDodatak(tag3);

        swipe.pogledajStory(dragan);
        swipe.pogledajStory(milan);
        swipe.pogledajStory(nikola);
        swipe.pogledajStory(jovan);

        swipe.postavljanjeStorija();
        System.out.println();
        swipe.korisniciKojiSuPregledali();
    }
}
