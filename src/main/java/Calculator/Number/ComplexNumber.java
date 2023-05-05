package Calculator.Number;

import java.util.ArrayList;
import java.util.List;

public class ComplexNumber extends CalcNumber {
  int imaginary;
  List<Integer> num;

  public ComplexNumber(int real, int imaginary) {
    super.x = real;
    this.imaginary = imaginary;
    this.num = new ArrayList<>();
  }

  public List<Integer> getNum() {
    num.add((Integer) this.x);
    num.add(this.imaginary);
    return num;
  }

  @Override
  public String toString() {
    return this.x + " + " + imaginary + "i";
  }
}
