package Seminar005;

import java.util.Objects;

public class Pair {
    private int x;
    private int y;

    public Pair(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int hashCode() {
//        return x * 21 + y * 57;
        return Objects.hash(x, y);
    }
}
