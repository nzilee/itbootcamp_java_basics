package p_23_5_2022.Exercise1;

public class Movie {

    private String title;
    private int year;

    public Movie (String title, int year){
        this.title = title;
        this.year = year;
    }

    public Movie (){}

    public void setName(String title){
        this.title = title;
    }

    public void setYear(int year){
        this.year = year;
    }

    public void print(){
        System.out.println(this.title + ", " + this.year);
    }
}
