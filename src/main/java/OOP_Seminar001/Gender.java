package OOP_Seminar001;

public enum Gender {
    male,
    female;

    @Override
    public String toString() {
        if (this == male) return "мужской";
        else return "женский";
    }
}
