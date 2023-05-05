package Calculator.Number;

public class FloatNumber extends CalcNumber{

    public FloatNumber(double num) {
        super.x = num;
    }

    public double getNum() {
        return (Double) this.x;
    }

    @Override
    public String toString() {
        return this.x + "";
    }
}
