package p_3_6_2022.Zadatak3;

public class AtleticariMain {
    public static void main(String[] args) {

        Disciplina skokUDalj = new Disciplina("Skok u dalj",
                "skakacka");
        Disciplina prepone = new Disciplina("110m sa preponama",
                "trkacka");

        Trkac j = new Trkac("Jovan Jovanovic", 25);
        Trkac b = new Trkac("Bojan Ivanovic", 20);

        j.boljiRezultat(b);

        Skakac v = new Skakac("Vojin Ivic", 8);
        Skakac d = new Skakac("Darko Bojic", 6);

        v.boljiRezultat(d);


        skokUDalj.dodajAtleticara(v);
        skokUDalj.dodajAtleticara(d);

        prepone.dodajAtleticara(j);
        prepone.dodajAtleticara(b);

        prepone.stampajPobednika();
        skokUDalj.stampajPobednika();

    }
}
