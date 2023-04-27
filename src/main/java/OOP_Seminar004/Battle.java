package OOP_Seminar004;

public class Battle {
  private Warrior attacker;
  private Warrior defender;

  public Battle(Warrior attacker, Warrior defender) {
    this.attacker = attacker;
    this.defender = defender;
  }
  public Warrior run() {
    while (true) {
      int attack = attacker.harm();
      defender.reduceHp(attack);
      System.out.printf(
          "Воин %s нанес урон в размере % d\n У воина %s осталось %d hp\n",
          attacker.getName(), attack, defender.getName(), defender.getHp());
      if (!defender.isAlive()) {
        System.out.printf("Воин %s погиб. Победитель %s", defender.getName(), attacker);
        return attacker;
      }
      attack = defender.harm();
      attacker.reduceHp(attack);
      System.out.printf(
              "Воин %s нанес ответный урон в размере % d\n У воина %s осталось %d hp\n",
              defender.getName(), attack, attacker.getName(), attacker.getHp());
      if (!attacker.isAlive()) {
        System.out.printf("Воин %s погиб. Победитель %s", attacker.getName(), defender);
        return defender;
      }
    }
  }
}
