package p_23_5_2022.Exercise1;

public class MovieDirectorMain {
    public static void main(String[] args) {

        Movie schindler = new Movie();

        schindler.setName("Schindler's List");
        schindler.setYear(1993);

        schindler.print();

        System.out.println("Directed by");

        Director steven = new Director();

        steven.setFullName("Steven Spielberg");
        steven.setAge(75);

        steven.print();

    }

}
