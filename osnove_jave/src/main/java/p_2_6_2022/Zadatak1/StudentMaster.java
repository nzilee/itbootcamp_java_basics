package p_2_6_2022.Zadatak1;

public class StudentMaster extends Student{


    public StudentMaster(String punoIme, int brIndeksa, int godinaStudija) {
        super(punoIme, brIndeksa, godinaStudija);
    }

    @Override
    public int cenaSkolarine() {
        if (this.naBudzetu()){
            return 0;
        } else {
            return 100000;
        }
    }

    @Override
    public boolean naBudzetu() {
        if (this.godinaStudija <= 2){
            return true;
        } else {
            return false;
        }
    }
}
