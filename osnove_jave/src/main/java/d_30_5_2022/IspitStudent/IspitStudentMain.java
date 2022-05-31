package d_30_5_2022.IspitStudent;

public class IspitStudentMain {
    public static void main(String[] args) {

        Student nikola = new Student(1011,
                "Nikola Zivkovic",
                "Osnovne");
                nikola.dodajIspit(new Ispit("Matematika", 6, "Jovan Jovanovic"));
                nikola.dodajIspit(new Ispit("Hemija", 9, "Milena Jovanovic"));
                nikola.dodajIspit(new Ispit("Engleski jezik", 10, "Aleksandar Jovic"));
                nikola.dodajIspit(new Ispit("Ekonomske strukture", 5, "Filip Filipovic"));

        nikola.print();


    }
}
