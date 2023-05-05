package Calculator.Model;


import Calculator.Number.CalcNumber;
import Calculator.Number.RealNumber;

public class RealCalcModel extends CalcModel{

    RealNumber numberX;
    RealNumber numberY;

    public RealCalcModel(RealNumber number_x, RealNumber number_y) {
        this.numberX = number_x;
        this.numberY = number_y;
    }

    public RealCalcModel() {
        super();
    }

    @Override
    public CalcNumber<RealNumber> sum() {
        int result = numberX.getNum() + numberY.getNum();
        return new RealNumber(result);
    }

    @Override
    public CalcNumber diff() {
        int result = numberX.getNum() - numberY.getNum();
        return new RealNumber(result);
    }

    @Override
    public CalcNumber mult() {
        int result = numberX.getNum() * numberY.getNum();
        return new RealNumber(result);
    }

    @Override
    public CalcNumber div() {
        int result = numberX.getNum() / numberY.getNum();
        return new RealNumber(result);
    }

    @Override
    public void setNumberX(CalcNumber numberX) {
        this.numberX = (RealNumber) numberX;
    }

    @Override
    public void setNumberY(CalcNumber numberY) {
        this.numberY = (RealNumber) numberY;
    }

//    @Override
//    public CalcNumber<RealNumber> getOperation(String operator) {
//        if (operator.equals("+")) {
//            return this.sum();
//        }
//        else if (operator.equals("-")){
//            return this.diff();
//        }
//        else if (operator.equals("*")){
//            return this.mult();
//        }
//        else if (operator.equals("/")){
//            return this.div();
//        }
//        else {return null;}
//    }
}
