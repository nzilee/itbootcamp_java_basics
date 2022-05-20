package p_19_5_2022;

public class Car {
    public String nameOfDriver;
    public String surnameOfDriver;
    public String brand;
    public int numberOfDoors;
    public double fuelConsumption;
    public int currentSpeed;
    public String regPlate;
    public boolean ACisON;
    public int yearOfManufacturing;
    public int expiringMonthOfReg;
    public int cube;
    public int fuelTankCapacity;
    public int currentLitersOfFuel;


    public void stampa() {
        System.out.println(this.nameOfDriver + " " + this.surnameOfDriver);
        System.out.println(this.brand + " - " + this.numberOfDoors + " doors");
        System.out.println("With fuel consumption of " + this.fuelConsumption + "l per 100km");
        System.out.println(this.currentSpeed + "km/h is current speed of the vehicle.");
        System.out.println("Registration plate of a vehicle is: " + regPlate);
    }

    public boolean overTheLimit(int limit) {
        if (this.currentSpeed > limit) {
            return true;
        } else {
            return false;
        }
    }

    public int fine(int limit) {

        if (limit < this.currentSpeed) {

            int overTheLimit = this.currentSpeed - limit;
            int fine = 0;

            for (int i = 0; i < overTheLimit; i++) {
                fine = fine + 1000;
            }
            return fine;
        }
        return 0;
    }

    public void acceleration() {
        this.currentSpeed = this.currentSpeed + 10;
    }

    public void deceleration() {
        this.currentSpeed = this.currentSpeed - 10;
        if (this.currentSpeed < 0) {
            this.currentSpeed = 0;
        }
    }

    public double newConsumption() {
        if (this.ACisON == false) {
            return (this.currentSpeed / 100.0 * this.fuelConsumption) * 1.0;
        }
        return ((this.currentSpeed / 100.0 * this.fuelConsumption) * 1.2);
    }

    public boolean isOldTimer(){
        if (this.yearOfManufacturing > 1950){
            return false;
        } else {
            return true;
        }
    }

    public boolean regIsExpired (int currentMonth){
        if (currentMonth > this.expiringMonthOfReg){
            return true;
        } else {
            return false;
        }
    }

    public double priceForReg (){
        double price;
        if (this.cube < 2000){
            price = this.cube * 100;
            return price;
        } else {
            price = (this.cube * 100) * 1.3;
            return price;
        }
    }

    public double refuel (int literForRefuel){

        int liter = 170;
        int price = literForRefuel * liter;

        if (this.fuelTankCapacity - this.currentLitersOfFuel >= literForRefuel){
            this.currentLitersOfFuel = this.currentLitersOfFuel + literForRefuel;
            return price;
        } else {
            price = (this.fuelTankCapacity - this.currentLitersOfFuel) * liter;
            this.currentLitersOfFuel = this.fuelTankCapacity;
            return price;
        }
    }


}