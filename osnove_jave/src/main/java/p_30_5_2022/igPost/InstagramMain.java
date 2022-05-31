package p_30_5_2022.igPost;

public class InstagramMain {
    public static void main(String[] args) {

        InstagramUser nikola = new InstagramUser("ni_ko_la",
                "Nikola Zivkovic",
                "nikola@email.com");

        InstagramTag tag = new InstagramTag(25,
                35,
                nikola);

        InstagramImage slika = new InstagramImage(50,
                "instagram.com/21312213");

        slika.dodajTag(tag);

        InstagramPost post = new InstagramPost("Super");

        post.dodajSliku(slika);

        post.print();
    }
}
