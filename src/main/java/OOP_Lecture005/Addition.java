package OOP_Lecture005;

public class Addition {
    private Number number1;
    private Number number2;

    public Addition(Number number1, Number number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    public int addition() {
        int result = number1.getNumber() + number2.getNumber();
        return result;
    }
}
