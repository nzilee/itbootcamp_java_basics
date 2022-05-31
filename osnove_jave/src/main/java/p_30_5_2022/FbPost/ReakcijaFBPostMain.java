package p_30_5_2022.FbPost;

import p_30_5_2022.FbPost.FacebookPost;
import p_30_5_2022.FbPost.Reakcija;

public class ReakcijaFBPostMain {
    public static void main(String[] args) {

        Reakcija nikola = new Reakcija();
        nikola.setReakcija("Smajli");
        nikola.setPunoImeKorisnika("Nikola");

        Reakcija mladen = new Reakcija();
        mladen.setReakcija("Smajli");
        mladen.setPunoImeKorisnika("Mladen");

        Reakcija milos = new Reakcija();
        milos.setReakcija("Smajli");
        milos.setPunoImeKorisnika("Milos");

        Reakcija milan = new Reakcija();
        milan.setReakcija("Lajk");
        milan.setPunoImeKorisnika("Milan");

        Reakcija marko = new Reakcija();
        marko.setReakcija("Srce");
        marko.setPunoImeKorisnika("Marko");

        Reakcija mihajlo = new Reakcija();
        mihajlo.setReakcija("Lajk");
        mihajlo.setPunoImeKorisnika("Mihajlo");


        FacebookPost noviPost = new FacebookPost("Nikola Zivkovic",
                "Najveci pozdravi");

        noviPost.dodajReakciju(nikola);
        noviPost.dodajReakciju(mladen);
        noviPost.dodajReakciju(milos);
        noviPost.dodajReakciju(milan);
        noviPost.dodajReakciju(marko);
        noviPost.dodajReakciju(mihajlo);

        nikola.setReakcija("Srce");

        noviPost.modifikacijaReaguj(nikola);

        noviPost.print();

    }
}
