package OOP_Seminar007.Cars;

import OOP_Seminar007.AI95;

public class Honda extends Car implements AI95 {

    int fuelTank;

    public Honda(int fuelTank) {
        this.fuelTank = fuelTank;
    }

    @Override
    public void refuel95() {

    }
}
