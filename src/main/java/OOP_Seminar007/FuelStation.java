package OOP_Seminar007;

import OOP_Seminar007.Cars.Car;

public class FuelStation {
  private Refueling refueling;

  public FuelStation(Refueling refueling) {
    this.refueling = refueling;
  }

  public void doRefueling(Integer amount, Car car) {
    refueling.doRefuel(amount, car);
  }
}
