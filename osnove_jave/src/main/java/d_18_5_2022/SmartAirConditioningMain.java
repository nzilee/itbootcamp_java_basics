package d_18_5_2022;

public class SmartAirConditioningMain {
    public static void main(String[] args) {

        SmartAirConditioning LG = new SmartAirConditioning();

        LG.brand = "LG";
        LG.temperatureSet = 28.5;
        LG.airMode = "hot";

        LG.print();

        System.out.println();

        SmartAirConditioning hisense = new SmartAirConditioning();

        hisense.brand = "Hisense";
        hisense.temperatureSet = 17;
        hisense.airMode = "cold";

        hisense.print();

        System.out.println();

        SmartAirConditioning vivax = new SmartAirConditioning();

        vivax.brand = "Vivax";
        vivax.temperatureSet = 34.5;
        vivax.airMode = "hot";

        vivax.print();

        System.out.println();
    }
}
