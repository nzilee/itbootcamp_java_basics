package d_20_5_2022;

import d_19_5_2022.FacebookPost;

public class FacebookPostMain {
    public static void main(String[] args) {

        d_20_5_2022.FacebookPost zika = new d_20_5_2022.FacebookPost("Zika Zikic", "Zika Limar",
                "Novo u gradu! Ispravljanje " + "ulegnuca na limariji Vaseg " +
                        "automobila nastalih usled vremenskih nepogoda");

        zika.like();
        zika.like();
        zika.like();
        zika.like();
        zika.like();

        zika.dislike();
        zika.dislike();
        zika.dislike();

        zika.share();
        zika.share();
        zika.share();
        zika.share();
        zika.share();

        zika.print();

        System.out.println();

        d_20_5_2022.FacebookPost pera = new d_20_5_2022.FacebookPost();

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

        d_20_5_2022.FacebookPost biljana = new d_20_5_2022.FacebookPost();

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

        d_20_5_2022.FacebookPost heartbreak = new d_20_5_2022.FacebookPost();

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
