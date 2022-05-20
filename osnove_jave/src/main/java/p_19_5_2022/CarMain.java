package p_19_5_2022;

public class CarMain {
    public static void main(String[] args) {

        Car peugeot = new Car();

        peugeot.nameOfDriver = "Nikola";
        peugeot.surnameOfDriver = "Zivkovic";
        peugeot.brand = "Peugeot";
        peugeot.numberOfDoors = 5;
        peugeot.fuelConsumption = 10.5;
        peugeot.currentSpeed = 132;
        peugeot.regPlate = "123peugeot123";
        peugeot.ACisON = true;
        peugeot.yearOfManufacturing = 2003;
        peugeot.expiringMonthOfReg = 11;
        peugeot.cube = 1700;
        peugeot.fuelTankCapacity = 50;
        peugeot.currentLitersOfFuel = 25;

        peugeot.stampa();

        boolean isOverTheLimit = peugeot.overTheLimit(120);
        int kazna = peugeot.fine(120);

        System.out.println();

        if (isOverTheLimit) {
            System.out.println("The vehicle is going over the speed limit");
        } else {
            System.out.println("The vehicle is going within the speed limit");
        }

        System.out.println("Fine for speed over the limit is: " + kazna);

        System.out.println();

        peugeot.acceleration();
        peugeot.acceleration();

        System.out.println("Now the speed is: " + peugeot.currentSpeed);


        System.out.println("New consumption is: " + peugeot.newConsumption());

        if (peugeot.isOldTimer()){
            System.out.println("The vehicle is an oldtimer");
        } else {
            System.out.println("The vehicle is not an oldtimer");
        }

        if (peugeot.regIsExpired(5)){
            System.out.println("Registration is expired");
        } else {
            System.out.println("Registration is not expired");
        }

        double priceForReg = peugeot.priceForReg();
        System.out.println("Price for registration is: " + priceForReg);

        double refuel = peugeot.refuel(20);
        System.out.println("Price for refueling is: " + refuel);
        System.out.println("Current liters of fuel in tank is: " + peugeot.currentLitersOfFuel);


        System.out.println("---------------------------------------------------");

        Car audi = new Car();

        audi.nameOfDriver = "Milovan";
        audi.surnameOfDriver = "Milovanovic";
        audi.brand = "Audi";
        audi.numberOfDoors = 4;
        audi.fuelConsumption = 8;
        audi.currentSpeed = 150;
        audi.regPlate = "456audi456";
        audi.ACisON = false;
        audi.yearOfManufacturing = 2008;
        audi.expiringMonthOfReg = 4;
        audi.cube = 2500;
        audi.fuelTankCapacity = 60;
        audi.currentLitersOfFuel = 38;

        audi.stampa();
        isOverTheLimit = audi.overTheLimit(80);
        kazna = audi.fine(80);

        System.out.println();

        if (isOverTheLimit) {
            System.out.println("The vehicle is going over the speed limit");
        } else {
            System.out.println("The vehicle is going within the speed limit");
        }

        System.out.println("Fine for speed over the limit is: " + kazna);

        audi.deceleration();
        audi.deceleration();

        System.out.println("Now the speed is: " + audi.currentSpeed);

        System.out.println("New consumption is: " + audi.newConsumption());

        if (audi.isOldTimer()){
            System.out.println("The vehicle is an oldtimer");
        } else {
            System.out.println("The vehicle is not an oldtimer");
        }

        if (audi.regIsExpired(5)){
            System.out.println("Registration is expired");
        } else {
            System.out.println("Registration is not expired");
        }

        priceForReg = audi.priceForReg();
        System.out.println("Price for registration is: " + priceForReg);

        refuel = audi.refuel(30);
        System.out.println("Current liters of fuel in tank is: " + audi.currentLitersOfFuel);
        System.out.println("Price for refueling is: " + refuel);
    }
}
