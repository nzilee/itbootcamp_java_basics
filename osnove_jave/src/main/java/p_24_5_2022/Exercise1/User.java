package p_24_5_2022.Exercise1;

public class User {

    private String fullName;
    private String licenceType;

    public User (){
        this.licenceType = "basic";
    }

    public User(String fullName) {
        this.fullName = fullName;
        this.licenceType = "basic";
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getLicenceType() {
        return licenceType;
    }

    public void subscribe (int paycheck){
        if (paycheck == 100){
            this.licenceType = "pro";
        }
        if (paycheck == 150){
            this.licenceType = "premium";
        }
    }

    public void unsubscribe (){
        this.licenceType = "basic";
    }

    public int maxCallLength (){
        if (this.licenceType.equals("basic")){
            return 40;
        }
        if (this.licenceType.equals("pro")){
            return 240;
        }
        if (this.licenceType.equals("premium")){
            return 1440;
        }
        return -1;
    }

    public void print (){
        System.out.println(this.fullName);
    }
}
