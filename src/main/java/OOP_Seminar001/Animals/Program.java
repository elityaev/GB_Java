package OOP_Seminar001.Animals;

import OOP_Seminar001.Animals.Food.Fish;
import OOP_Seminar001.Animals.Food.Meat;
import OOP_Seminar001.Animals.Food.Milk;
import OOP_Seminar001.Animals.Food.Seeds;

public class Program {
    public static void main(String[] args){
        Cat cat = new Cat("Barsic");
        System.out.println(cat);

        Hamster hamster = new Hamster("Homa");
        System.out.println(hamster);

        Milk milk = new Milk();
        Fish fish = new Fish();
        Meat meat = new Meat();
        Seeds seeds = new Seeds();

        cat.eatFish(fish);
        System.out.println(cat);
        cat.eatMeat(meat);
        System.out.println(cat);
        cat.eatMilk(milk);
        cat.eatMilk(milk);

        hamster.eatSeeds(seeds);
        System.out.println(hamster);
        hamster.eatMilk(milk);
        System.out.println(hamster);
        hamster.eatSeeds(seeds);
        System.out.println(hamster);
        hamster.eatSeeds(seeds);

    }
}
