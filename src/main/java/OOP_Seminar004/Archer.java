package OOP_Seminar004;

public class Archer<T extends SmallShield> extends Warrior<Throwing, SmallShield> {


  public Archer(String name, int hp, Throwing weapon, SmallShield smallShield) {
    super(name, hp, weapon, smallShield);
  }

  public Archer(String name, int hp, Throwing weapon) {
    super(name, hp, weapon);
  }

  public int qetRange() {
    return rand.nextInt(weapon.getDistance() + 1);
  }

  @Override
  public String toString() {
    return "Archer{" + super.toString() + '}';
  }
}
