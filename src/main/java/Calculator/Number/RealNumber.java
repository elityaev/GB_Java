package Calculator.Number;

public class RealNumber extends CalcNumber {

    public RealNumber(int num) {
        super.x = num;
    }

    public int getNum() {
        return (Integer) this.x;
    }

    @Override
    public String toString() {
        return this.x + "";
    }
}
