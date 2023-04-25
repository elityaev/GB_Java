package OOP_Seminar003;

public enum Relation {
    PARENT ("Родители"),
    SPOUSE ("Супруг(а)"),
    CHILDREN ("Дети");

    private final String name;

    private Relation(String s) {
        name = s;
    }

    public String toString() {
        return this.name;
    }

}
