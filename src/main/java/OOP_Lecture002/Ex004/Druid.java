package OOP_Lecture002.Ex004;

public class Druid extends BaseHero {

    int mp;

    public Druid(String name, int hp, int mp) {
        super(name, hp);
        System.out.println("Вызван Druid(String name, int hp)");
        // инициализируем новое поле своего класса
        this.mp = mp;
        // переопределяем и инициализируем поле базового класса

    }

    public Druid() {
        this("", 0, 0);
        // super("", 0);
        System.out.println("Вызван Druid()");
    }
}