package d_19_5_2022;

import d_18_5_2022.SmartAirConditioning;

public class SmartAirConditioningMain {
    public static void main(String[] args) {

        d_19_5_2022.SmartAirConditioning LG = new d_19_5_2022.SmartAirConditioning();

        LG.brand = "LG";
        LG.coolingkWh = 0.8;
        LG.heatingkWh = 1.3;
        LG.temperatureSet = 28.5;
        LG.airMode = "hot";

        LG.print();

        double kWhConsumption = LG.monthlyExpensesInkWh();
        System.out.println("Monthly kW/h expense is: " + kWhConsumption);

        double costPerMonth = LG.monthlyExpenses();
        System.out.println("Monthly cost is: " + costPerMonth);

        System.out.println();

        d_19_5_2022.SmartAirConditioning hisense = new d_19_5_2022.SmartAirConditioning();

        hisense.brand = "Hisense";
        hisense.coolingkWh = 1.2;
        hisense.heatingkWh = 1.7;
        hisense.temperatureSet = 17;
        hisense.airMode = "cold";

        hisense.print();

        kWhConsumption = hisense.monthlyExpensesInkWh();
        System.out.println("Monthly kW/h expense is: " + kWhConsumption);

        costPerMonth = hisense.monthlyExpenses();
        System.out.println("Monthly cost is: " + costPerMonth);


        System.out.println();

        d_19_5_2022.SmartAirConditioning vivax = new d_19_5_2022.SmartAirConditioning();

        vivax.brand = "Vivax";
        vivax.coolingkWh = 0.4;
        vivax.heatingkWh = 0.8;
        vivax.temperatureSet = 34.5;
        vivax.airMode = "cool";

        vivax.print();

        kWhConsumption = vivax.monthlyExpensesInkWh();
        System.out.println("Monthly kW/h expense is: " + kWhConsumption);

        costPerMonth = vivax.monthlyExpenses();
        System.out.println("Monthly cost is: " + costPerMonth);
    }
}
