package OOP_Seminar005;

import java.util.Scanner;

public class ComplexNumber extends number {

  double imaginary;
  public ComplexNumber(double real, double imaginary) {
    super.x = real;
    this.imaginary = imaginary;
  }


  public ComplexNumber getValue() {
    Scanner in = new Scanner(System.in);
      double[] numbers = new double[2];
      for (int i = 0; i < 2; ++i) {
        numbers[i] = in.nextDouble();
      }
      ComplexNumber complexNumber = new ComplexNumber(numbers[0], numbers[1]);
      return complexNumber;

  }

  @Override
  public boolean equals(Object obj) {
    if (obj == this) {
      return true;
    }
    if (obj == null || obj.getClass() != this.getClass()) {
        return false;
    }
    ComplexNumber complexNumbers = (ComplexNumber) obj;
    return super.x == complexNumbers.x && this.imaginary == complexNumbers.imaginary;
  }

  @Override
  public String toString() {
    return "ComplexNumbers{" +
            x + " + " + this.imaginary + "i" +
            '}';
  }
}
