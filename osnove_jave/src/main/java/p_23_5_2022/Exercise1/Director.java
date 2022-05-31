package p_23_5_2022.Exercise1;

public class Director {

    private String fullName;
    private int age;

    public Director(){}

    public Director(String fullName, int age){
        this.fullName = fullName;
        this.age = age;
    }

    public void setFullName(String fullName){
        this.fullName = fullName;
    }
    public void setAge(int age){
        this.age = age;
    }

    public void print(){
        System.out.println(this.fullName + ", " + age + " god");
    }


}
