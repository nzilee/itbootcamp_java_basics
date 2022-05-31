package p_30_5_2022.igPost;

public class InstagramTag {

    private int x;
    private int y;
    private InstagramUser taggedUser;

    public InstagramTag(int x, int y, InstagramUser user) {
        this.x = x;
        this.y = y;
        this.taggedUser = user;
    }

    public void print(){
        System.out.print("X taga je: " + this.x + " | ");
        System.out.println("Y taga je: " + this.y);
        taggedUser.print();
    }
}
