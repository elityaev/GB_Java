package OOP_Seminar004;

public class Knife implements Weapon{

    @Override
    public int damage() {
        return 20;
    }

    @Override
    public String toString() {
        return "Knife{" +
                damage() +
                "}";
    }
}
