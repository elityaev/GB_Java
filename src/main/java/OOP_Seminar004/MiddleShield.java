package OOP_Seminar004;

public class MiddleShield extends Shield{
    @Override
    public int defense() {
        return 5;
    }

    @Override
    public String toString() {
        return "MiddleShield{" +
                defense() +
                '}';
    }
}
