package OOP_Seminar007.Cars;

import OOP_Seminar007.Diesel;

public class BMW extends Car implements Diesel {
    int fuelTank;

    public BMW(int fuelTank) {
        this.fuelTank = fuelTank;
    }

    @Override
    public void refuelDiesel() {

    }
}
