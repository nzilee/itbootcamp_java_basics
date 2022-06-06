package d_2_6_2022;

public class Menadzer extends Radnik{


    public Menadzer(String punoIme) {
        super(punoIme);
    }

    @Override
    public double plataRadnika() {
        int suma = 0;
        for (int i = 0; i < this.nizSektora.size(); i++) {
            suma = suma + this.nizSektora.get(i).getPlata();
        }
        return suma;
    }
}
