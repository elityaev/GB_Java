package Calculator.View;

import Calculator.Number.CalcNumber;
import Calculator.Number.RealNumber;

import java.util.Scanner;

public class RealView implements View{
  Scanner in = new Scanner(System.in);

  @Override
  public CalcNumber<RealNumber> getValue(String title) {
    System.out.printf("%s", title);
    int value = in.nextInt();
    RealNumber realNumber = new RealNumber(value);
    return realNumber;
  }

  @Override
  public void print(CalcNumber data, String title) {
    System.out.printf("%s %s", title, data);
  }


}
