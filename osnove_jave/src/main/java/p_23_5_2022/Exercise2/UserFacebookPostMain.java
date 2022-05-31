package p_23_5_2022.Exercise2;

public class UserFacebookPostMain {
    public static void main(String[] args) {

        User nikola = new User("Nikola", "Zivkovic");

        FacebookPost reklama = new FacebookPost("Svakog dana akcija u marketu", nikola);

        reklama.print();


    }
}
