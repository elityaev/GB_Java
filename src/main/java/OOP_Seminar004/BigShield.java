package OOP_Seminar004;

public class BigShield extends Shield {

    @Override
    public int defense() {
        return 8;
    }

    @Override
    public String toString() {
        return "BigShield{" +
                defense() +
                '}';
    }
}
