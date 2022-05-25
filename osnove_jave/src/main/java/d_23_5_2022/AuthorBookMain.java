package d_23_5_2022;

public class AuthorBookMain {
    public static void main(String[] args) {

        Author stephen = new Author();

        stephen.setFullName("Stephen King");

        Book theShinning = new Book("312FDS31SDF2",
                "The Shinning",
                1977,
                stephen);
        theShinning.print();

        System.out.println("--------------------------------------------------");

        Author william = new Author();

        william.setFullName("William Golding");

        Book lordOfTheFlies = new Book("33S2FGG3214",
                "Lord of the Flies",
                1954,
                william);
        lordOfTheFlies.print();

        System.out.println("--------------------------------------------------");

        Book carrie = new Book("KDN324LAK355",
                "Carrie",
                1974,
                stephen);
        carrie.print();

    }
}
