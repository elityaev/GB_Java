package Calculator.Model;

import Calculator.Number.CalcNumber;
import Calculator.Number.ComplexNumber;

public class ComplexCalcModel extends CalcModel {
  ComplexNumber numberX;
  ComplexNumber numberY;

  public ComplexCalcModel(ComplexNumber number_x, ComplexNumber number_y) {
    this.numberX = number_x;
    this.numberY = number_y;
  }

  public ComplexCalcModel() {
    super();
  }

  @Override
  public CalcNumber<ComplexNumber> sum() {
    int real1 = numberX.getNum().get(0);
    int imaginary1 = numberX.getNum().get(1);
    int real2 = numberY.getNum().get(0);
    int imaginary2 = numberY.getNum().get(1);
    return new ComplexNumber((real1 + real2), (imaginary1 + imaginary2));
  }

  @Override
  public CalcNumber diff() {
    int real1 = numberX.getNum().get(0);
    int imaginary1 = numberX.getNum().get(1);
    int real2 = numberY.getNum().get(0);
    int imaginary2 = numberY.getNum().get(1);
    return new ComplexNumber((real1 - real2), (imaginary1 - imaginary2));
  }

  @Override
  public CalcNumber mult() {
    int real1 = numberX.getNum().get(0);
    int imaginary1 = numberX.getNum().get(1);
    int real2 = numberY.getNum().get(0);
    int imaginary2 = numberY.getNum().get(1);
    return new ComplexNumber(
        (real1 * real2 - imaginary1 * imaginary2), (imaginary1 * real2 + real1 * imaginary2));
  }

  @Override
  public CalcNumber div() {
    int real1 = numberX.getNum().get(0);
    int imaginary1 = numberX.getNum().get(1);
    int real2 = numberY.getNum().get(0);
    int imaginary2 = numberY.getNum().get(1);
    int c2RealPow = (int) Math.pow(real2, 2);
    int c2ImaginaryPow = (int) Math.pow(imaginary2, 2);
    return new ComplexNumber(
        ((real1 * real2 + imaginary1 * imaginary2) / (c2RealPow + c2ImaginaryPow)),
        ((imaginary1 * real2 - real1 * imaginary2) / (c2RealPow + c2ImaginaryPow)));
  }

  @Override
  public void setNumberX(CalcNumber numberX) {
    this.numberX = (ComplexNumber) numberX;
  }

  @Override
  public void setNumberY(CalcNumber numberY) {
    this.numberY = (ComplexNumber) numberY;
  }
}
