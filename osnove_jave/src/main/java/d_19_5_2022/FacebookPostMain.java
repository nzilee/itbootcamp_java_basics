package d_19_5_2022;

public class FacebookPostMain {
    public static void main(String[] args) {

        FacebookPost pera = new FacebookPost();

        pera.fullName = "Pera Peric";
        pera.profileName = "Mehanicar Pera";
        pera.postedText = "Samo danas AKCIJA na svaki odradjeni mali i veliki servis!";

        pera.like();
        pera.like();
        pera.like();
        pera.like();
        pera.like();
        pera.like();
        pera.like();
        pera.like();

        pera.dislike();
        pera.dislike();
        pera.dislike();

        pera.share();
        pera.share();
        pera.share();
        pera.share();

        pera.print();

        System.out.println();

        FacebookPost biljana = new FacebookPost();

        biljana.fullName = "Biljana Cvetkovic";
        biljana.profileName = "Bilja Nokti";
        biljana.postedText = "Drage moje, zbog trenutne svetske situacije i " +
                "poskupljenja materijala, cene su korigovane za 20%";

        biljana.like();
        biljana.like();
        biljana.like();
        biljana.like();
        biljana.like();
        biljana.like();
        biljana.like();
        biljana.like();
        biljana.like();
        biljana.like();

        biljana.dislike();
        biljana.dislike();
        biljana.dislike();
        biljana.dislike();
        biljana.dislike();
        biljana.dislike();


        biljana.share();
        biljana.share();
        biljana.share();
        biljana.share();
        biljana.share();
        biljana.share();
        biljana.share();
        biljana.share();

        biljana.print();

        System.out.println();

        FacebookPost heartbreak = new FacebookPost();

        heartbreak.fullName = "Miljan Prodanovic";
        heartbreak.profileName = "Miljan Prodanovic - Ema u SRCU";
        heartbreak.postedText = "Ljubavi zasto si me zamenila za par krpica i BMW volan";

        heartbreak.like();
        heartbreak.like();
        heartbreak.like();
        heartbreak.like();
        heartbreak.like();
        heartbreak.like();
        heartbreak.like();
        heartbreak.like();
        heartbreak.like();
        heartbreak.like();
        heartbreak.like();
        heartbreak.like();
        heartbreak.like();

        heartbreak.dislike();


        heartbreak.share();
        heartbreak.share();
        heartbreak.share();
        heartbreak.share();
        heartbreak.share();
        heartbreak.share();
        heartbreak.share();
        heartbreak.share();
        heartbreak.share();
        heartbreak.share();

        heartbreak.print();
    }
}
