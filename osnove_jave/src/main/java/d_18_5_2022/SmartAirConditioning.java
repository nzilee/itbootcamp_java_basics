package d_18_5_2022;

public class SmartAirConditioning {

    public String brand;
    public double temperatureSet;
    public String airMode;

    public void print(){
        System.out.println("Hey Alexa, turn on " + this.brand + " air conditioner, set the temperature to " +
                this.temperatureSet + " degrees and blow out " + this.airMode + " air.");
    }


}
