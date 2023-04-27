package OOP_Seminar004;

public class SmallShield extends Shield {

    @Override
    public int defense() {
        return 3;
    }

    @Override
    public String toString() {
        return "SmallShield{" +
                defense() +
                '}';
    }

}
