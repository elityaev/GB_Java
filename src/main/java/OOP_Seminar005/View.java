package OOP_Seminar005;

import java.util.Scanner;

public class View {
  Scanner in = new Scanner(System.in);

  public ComplexNumber getValue(String values) {
    double[] numbers = new double[2];
    for (int i = 0; i < 2; ++i) {
      numbers[i] = in.nextDouble();
    }
    ComplexNumber complexNumber = new ComplexNumber(numbers[0], numbers[1]);
    return complexNumber;
  }

  public RealNumber getRealValue(String values) {
    System.out.printf("%s", values);
    int result = in.nextInt();
    RealNumber number = new RealNumber(result);
    return number;
  }

  public void print(Object data, String title) {
    System.out.printf("%s %d", title, data);
  }
}
