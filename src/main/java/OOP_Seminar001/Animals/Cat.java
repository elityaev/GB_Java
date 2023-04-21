package OOP_Seminar001.Animals;

import OOP_Seminar001.Animals.Food.Fish;
import OOP_Seminar001.Animals.Food.Meat;
import OOP_Seminar001.Animals.Food.Milk;
import OOP_Seminar001.Animals.Interfaces.EatFish;
import OOP_Seminar001.Animals.Interfaces.EatMeat;
import OOP_Seminar001.Animals.Interfaces.EatMilk;

public class Cat extends Animal implements EatFish, EatMeat, EatMilk {

  public Cat(String name) {
    super(name);
  }

  @Override
  public void eatFish(Fish fish) {
    if (!wellFed()) {
      this.hunger = this.hunger - 20;
    }
  }

  @Override
  public void eatMeat(Meat meat) {
    if (!wellFed()) {
      this.hunger = this.hunger - 20;
    }
  }

  @Override
  public void eatMilk(Milk milk) {
    if (!wellFed()) {
      this.hunger = this.hunger - 20;
    }
  }
}
