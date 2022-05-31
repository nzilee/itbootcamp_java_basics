package p_24_5_2022.Exercise2;

public class IndividualEntity {

    private String fullName;
    private String numberID;
    private String jmbg;
    private boolean hasBoughtThroughAgency;

    public IndividualEntity(String jmbg){
        this.jmbg = jmbg;
    }

    public IndividualEntity (String fullName, String numberID, String jmbg){
        this.fullName = fullName;
        this.numberID = numberID;
        this.jmbg = jmbg;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getNumberID() {
        return numberID;
    }

    public void setNumberID(String numberID) {
        this.numberID = numberID;
    }

    public String getJmbg() {
        return jmbg;
    }

    public boolean isHasBoughtThroughAgency() {
        return hasBoughtThroughAgency;
    }

    public void setHasBoughtThroughAgency(boolean hasBoughtThroughAgency) {
        this.hasBoughtThroughAgency = hasBoughtThroughAgency;
    }

    public void print(){
        System.out.println(this.fullName + ", " + this.numberID);
    }
}
