package OOP_Seminar001.Animals;

import OOP_Seminar001.Animals.Food.Milk;
import OOP_Seminar001.Animals.Food.Seeds;
import OOP_Seminar001.Animals.Interfaces.EatMilk;
import OOP_Seminar001.Animals.Interfaces.EatSeeds;

public class Hamster extends Animal implements EatSeeds, EatMilk {
    public Hamster(String name) {
        super(name);
    }

    @Override
    public void eatSeeds(Seeds seeds) {
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
