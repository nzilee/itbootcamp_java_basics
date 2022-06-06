package p_2_6_2022.Zadatak4;

import java.util.ArrayList;

public class FiguraMain {
    public static void main(String[] args) {

        ArrayList<Figura> nizFigura = new ArrayList<>();

        nizFigura.add(new JednakostranicniTrougao(5));
        nizFigura.add(new JednakostranicniTrougao(8));
        nizFigura.add(new JednakostranicniTrougao(3));
        nizFigura.add(new Pravougaonik(5,7));
        nizFigura.add(new Pravougaonik(9,11));

        for (int i = 0; i < nizFigura.size(); i++) {
            nizFigura.get(i).obim();
            nizFigura.get(i).povrsina();
            nizFigura.get(i).print();
            System.out.println();
        }

        double x = 0;

        for (int i = 0; i < nizFigura.size(); i++) {
            x = nizFigura.get(i).obim() + nizFigura.get(i).povrsina();

            System.out.print("Zbir obima i povrsine ");
            nizFigura.get(i).ime();
            System.out.print(" je: " + x);
            System.out.println();
        }

    }
}
