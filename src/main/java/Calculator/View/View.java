package Calculator.View;

import Calculator.Number.CalcNumber;
import Calculator.Number.RealNumber;

public interface View<T extends CalcNumber> {
  T getValue(String title);

  void print(T data, String title);

}
