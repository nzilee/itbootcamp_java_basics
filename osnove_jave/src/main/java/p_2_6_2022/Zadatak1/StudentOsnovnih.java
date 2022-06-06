package p_2_6_2022.Zadatak1;

public class StudentOsnovnih extends Student{


    public StudentOsnovnih(String punoIme, int brIndeksa, int godinaStudija) {
        super(punoIme, brIndeksa, godinaStudija);
    }

    @Override
    public int cenaSkolarine() {
        if (this.naBudzetu()){
            return 0;
        } else {
            return 90000;
        }
    }

    @Override
    public boolean naBudzetu() {
        if (this.godinaStudija <= 5){
            return true;
        } else {
            return false;
        }
    }
}
