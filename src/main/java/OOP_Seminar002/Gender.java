package OOP_Seminar002;

public enum Gender {
    male,
    female;

    @Override
    public String toString() {
        if (this == male) return "мужской";
        else return "женский";
    }
}
