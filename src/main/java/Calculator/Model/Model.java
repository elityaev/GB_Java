package Calculator.Model;

import Calculator.Number.CalcNumber;

public interface Model<E extends CalcNumber> {
    E sum();
    E diff();
    E mult();
    E div();

    E getOperation(String operator);
}
