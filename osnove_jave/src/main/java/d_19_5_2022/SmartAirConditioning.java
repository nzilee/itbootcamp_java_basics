package d_19_5_2022;

public class SmartAirConditioning {

    public String brand;
    public double coolingkWh;
    public double heatingkWh;

    public double temperatureSet;
    public String airMode;

    public void print(){
        System.out.println(this.brand + " - " + this.airMode + " - " + this.temperatureSet);
    }

    public double monthlyExpensesInkWh (){
        if (this.airMode.equals("hot")) {
            return 30 * 15 * this.heatingkWh;
        } else {
            return 30 * 15 * this.coolingkWh;
        }
    }

    public double monthlyExpenses (){
        int pricePerkWh = 6;

        if (monthlyExpensesInkWh() <= 350){
            return monthlyExpensesInkWh() * pricePerkWh;
        }

        if (monthlyExpensesInkWh() > 350){
            pricePerkWh = 9;
            return monthlyExpensesInkWh() * pricePerkWh;
        }
        return -1;
    }




}
