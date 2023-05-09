package OOP_Seminar007;

import OOP_Seminar007.Cars.Car;

public interface Refueling<C extends Car> {
    void doRefuel(Integer amount, C car);
}
