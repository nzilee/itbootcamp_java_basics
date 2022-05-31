package p_23_5_2022.Exercise2;

public class User {

    private String fName;
    private String lName;

    public User(String fName, String lName){
        this.fName = fName;
        this.lName = lName;
    }

    public void print(){
        System.out.println(this.fName + " " + this.lName);
    }
}
