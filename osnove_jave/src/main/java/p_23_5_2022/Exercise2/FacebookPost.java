package p_23_5_2022.Exercise2;

public class FacebookPost {

    private String text;
    private User user;

    public FacebookPost(String text, User user){
        this.text = text;
        this.user = user;
    }


    public void print(){
        this.user.print();
        System.out.println(this.text);
    }
}
