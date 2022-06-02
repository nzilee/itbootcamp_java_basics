package p_31_5_2022.Zadatak1;

public class OsobaStudentProfesorMain {
    public static void main(String[] args) {

        Profesor jovan = new Profesor("Jovan Jovanovic",
                "3211985740032",
                "Matematika",
                55000);
        jovan.povecajPlatu(1.5);

        Profesor ivan = new Profesor("Ivan Ivanovic",
                "5273845740032",
                "Hemija",
                65000);
        ivan.povecajPlatu(1.3);


        Student andrija = new Student("Andrija Jovic",
                "9277645837722",
                11011,
                120000);
        andrija.uplatiSkolarinu(15000);

        Student nikola = new Student("Nikola Zivkovic",
                "031100645837722",
                10012,
                80000);
        nikola.uplatiSkolarinu(5000);

        jovan.print();
        System.out.println();
        ivan.print();
        System.out.println();
        andrija.print();
        System.out.println();
        nikola.print();
    }
}
