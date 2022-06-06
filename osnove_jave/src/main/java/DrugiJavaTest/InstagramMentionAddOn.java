package DrugiJavaTest;

public class InstagramMentionAddOn extends InstagramAddOn {

    private InstagramUser tagovan;


    public InstagramMentionAddOn(int ID, int x, int y,
                                 int visina, int sirina) {
        super(ID, x, y, visina, sirina);
    }

    public InstagramUser getTagovan() {
        return tagovan;
    }

    public void setTagovan(InstagramUser tagovan) {
        this.tagovan = tagovan;
    }

    @Override
    public int minSirina() {
        return 80;
    }

    @Override
    public int minVisina() {
        return 50;
    }

    @Override
    public void print() {
        System.out.println(this.X + ", " + this.Y +
                " (" + this.visina + ", " + this.sirina + ")" +
                " @" + this.tagovan.getUsername() +
                "/" + this.tagovan.generateURL());

    }
}
