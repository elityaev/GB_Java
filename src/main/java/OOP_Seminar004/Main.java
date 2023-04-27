package OOP_Seminar004;

public class Main {
  public static void main(String[] args) {
    Team<Archer> archers = new Team<>();
    Team<Knight> knights = new Team<>();
    archers
        .addPersons(new Archer("Robin", 100, new Bow(20)))
        .addPersons(new Archer("Bobin", 100, new Bow(12)));

    System.out.println(archers.getMinShield());

    knights
        .addPersons(new Knight("Artur", 150, new Knife(), new MiddleShield()))
        .addPersons(new Knight("Edvard", 150, new Knife(), new BigShield()))
        .addPersons(new Knight("Filip", 150, new Knife(), new MiddleShield()));

    System.out.println(knights.getMinShield());

    // лучник не может иметь большой щит, но может быть вообще без щита
//    Archer archer1 = new Archer("Robin", 40, new Bow(20), new BigShield());
    Archer archer1 = new Archer("Robin", 40, new Bow(20));
    Archer archer2 = new Archer("Bobin", 40, new Bow(12), new SmallShield());

    // можно создать c разными видами щитов или без щита
//    Knight knight1 = new Knight("Artur", 40, new Knife());
    Knight knight1 = new Knight("Artur", 40, new Knife(), new BigShield());
    Knight knight2 = new Knight("Edvard", 40, new Knife(), new SmallShield());
//    System.out.println(archer1.getProtection());

//    Battle fight = new Battle(knight1, knight2);
//    fight.run();
  }
}
