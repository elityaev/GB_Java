package Calculator.Model;

import Calculator.Number.CalcNumber;
import Calculator.Number.RealNumber;

public abstract class CalcModel<T> implements Model {
    public CalcNumber<T> getOperation(String operator) {
        if (operator.equals("+")) {
            return this.sum();
        }
        else if (operator.equals("-")){
            return this.diff();
        }
        else if (operator.equals("*")){
            return this.mult();
        }
        else if (operator.equals("/")){
            return this.div();
        }
        else {return null;}
    }
}




