package OOP_Seminar004;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Team<T extends Person> implements Iterable<T>{
    List<T> persons = new ArrayList<>();

    @Override
    public Iterator<T> iterator() {
        return persons.iterator();
    }

    public Team<T> addPersons(T person){
        persons.add(person);
        return this;
    }

    @Override
    public String toString() {
        return "Team{" +
                " persons = " + persons +
                '}';
    }

    public int maxRange(){
        int max = 0;
        for (T person : this) {
            if (person instanceof Archer){
                Archer archer = (Archer) person;
                if (archer.qetRange() > max){
                    max = archer.qetRange();
                }
            }
        }
        return max;
    }

    public Object getMinShield(){
        int minDefence = 9;
        Warrior warriorWithMinShield = null;
        for (T person : this) {
            Warrior warrior = (Warrior) person;
            if (warrior.getProtection() < minDefence) {
                minDefence = warrior.getProtection();
                warriorWithMinShield = warrior;
            }
        }
        if (minDefence == 0) {return "В этой команде нет воинов с щитами";}
        else {return warriorWithMinShield.protection;}

    }
}
