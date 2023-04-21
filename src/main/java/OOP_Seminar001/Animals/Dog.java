package OOP_Seminar001.Animals;

import OOP_Seminar001.Animals.Food.Meat;
import OOP_Seminar001.Animals.Interfaces.EatMeat;

public class Dog extends Animal implements EatMeat {

  public Dog(String name) {
    super(name);
  }

  @Override
  public void eatMeat(Meat meat) {
    if (!wellFed()) {
      this.hunger = this.hunger - 20;
    }
  }
}
