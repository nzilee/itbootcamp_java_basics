package p_2_6_2022.Zadatak1;

public class StudentMain {
    public static void main(String[] args) {

        StudentOsnovnih n = new StudentOsnovnih("Nikola Zivkovic",
                1011,
                4);

        StudentOsnovnih m = new StudentOsnovnih("Mladen Milovanovic",
                1959,
                6);

        StudentMaster v = new StudentMaster("Vojin Milic",
                1818,
                7);

        StudentMaster l = new StudentMaster("Luka Mitic",
                1834,
                2);

        n.print();
        System.out.println();
        m.print();
        System.out.println();
        v.print();
        System.out.println();
        l.print();



    }
}
