package Calculator.Model;

import Calculator.Number.CalcNumber;

public interface ModelSetNumber<E extends CalcNumber> {
    void setNumberX(E numberX);

    void setNumberY(E numberY);
}
