package OOP_Lecture001.Ex006;

public class Program {
  public static void main(String[] args) {
    Magician hero1 = new Magician();
    System.out.println(hero1.getInfo());

    Priest hero2 = new Priest();
    System.out.println(hero2.getInfo());

    Priest hero3 = new Priest();
    System.out.println(hero3.getInfo());

    System.out.println("----------------------------------");
    Teams team1 = new Teams();
    System.out.println(team1);
  }
}
