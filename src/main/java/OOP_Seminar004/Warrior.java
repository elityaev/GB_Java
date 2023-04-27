package OOP_Seminar004;

import java.util.Random;

public class Warrior<T extends Weapon, D extends Protection> extends Person {
  protected T weapon;
  protected D protection;
  protected static Random rand = new Random();

  public Warrior(String name, int hp, T weapon, D protection) {
    super(name, hp);
    this.weapon = weapon;
    this.protection = protection;
  }

  public Warrior(String name, int hp, T weapon) {
    super(name, hp);
    this.weapon = weapon;
  }

  public int getProtection() {
    if (this.protection == null) {
      return 0;
    } else {
      return protection.defense();
    }
  }

  public int harm() {
    boolean isHit = rand.nextBoolean();
    int damage = 0;
    if (isHit) {
      damage = rand.nextInt(weapon.damage() + 1);
    }
    return damage;
  }

  public boolean isProtected() {
    return this.protection == null;
  }

  @Override
  public void reduceHp(int damage) {
    if (isProtected()) {
      super.reduceHp(damage);
    } else {
      int damage_with_defence = damage - protection.defense();
      if (damage_with_defence < 0) {
        damage_with_defence = 0;
      }
      super.reduceHp(damage_with_defence);
    }
  }

  @Override
  public String toString() {
    return "Warrior{"
        + " name = "
        + getName()
        + " hp = "
        + getHp()
        + " weapon = "
        + weapon
        + " protection = "
        + protection
        + '}';
  }
}
