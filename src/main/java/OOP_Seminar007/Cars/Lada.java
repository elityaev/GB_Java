package OOP_Seminar007.Cars;

import OOP_Seminar007.AI92;
import OOP_Seminar007.Cars.Car;

public class Lada extends Car implements AI92 {

    int fuelTank;

    public Lada(int fuelTank) {
        this.fuelTank = fuelTank;
    }

    @Override
    public void refuel92() {

    }
}
