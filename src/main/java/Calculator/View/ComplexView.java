package Calculator.View;

import Calculator.Number.CalcNumber;
import Calculator.Number.ComplexNumber;

import java.util.Scanner;

public class ComplexView implements View {
  Scanner in = new Scanner(System.in);

  @Override
  public CalcNumber<ComplexNumber> getValue(String title) {
    System.out.printf("%s", title);
    int real = in.nextInt();
    int imaginary = in.nextInt();
    ComplexNumber complexNumber = new ComplexNumber(real, imaginary);
    return complexNumber;
  }

  @Override
  public void print(CalcNumber data, String title) {
    System.out.printf("%s %s", title, data);
  }
}
