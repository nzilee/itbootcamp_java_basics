package DrugiJavaTest;

public abstract class InstagramAddOn {

    protected int ID;
    protected int X;
    protected int Y;
    protected int visina;
    protected int sirina;


    public InstagramAddOn(int ID, int x, int y, int visina, int sirina) {
        this.ID = ID;
        X = x;
        Y = y;
        this.visina = visina;
        this.sirina = sirina;
    }

    public int getID() {
        return ID;
    }

    public int getX() {
        return X;
    }

    public int getY() {
        return Y;
    }

    public int getVisina() {
        return visina;
    }

    public int getSirina() {
        return sirina;
    }

    public abstract int minSirina();
    public abstract int minVisina();

    public void povecanjeDimenzija(int visina, int sirina){
        this.visina = this.visina + visina;
        this.sirina = this.sirina + sirina;
    }
    public void smanjenjeDimenzija(int visina, int sirina){
        if (this.visina + visina < this.minVisina()){
            this.visina = this.visina - visina;
        } else {
            this.visina = this.minVisina();
        }

        if (this.sirina + sirina < this.minSirina()){
            this.sirina = this.sirina - sirina;
        } else {
            this.sirina = this.minSirina();
        }
    }

    public abstract void print();
}
