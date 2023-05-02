package OOP_Seminar005;

public class CalculateComplex {
  double real1;
  double imaginary1;
  double real2;
  double imaginary2;

  public CalculateComplex(double real1, double imaginary1, double real2, double imaginary2) {
    this.real1 = real1;
    this.imaginary1 = imaginary1;
    this.real2 = real2;
    this.imaginary2 = imaginary2;
  }

  public ComplexNumber sum() {
    return new ComplexNumber((real1 + real2), (imaginary1 + imaginary2));
  }

  public ComplexNumber diff() {
    return new ComplexNumber((real1 - real2), (imaginary1 - imaginary2));
  }

  public ComplexNumber mult() {
    return new ComplexNumber(
        (real1 * real2 - imaginary1 * imaginary2), (imaginary1 * real2 + real1 * imaginary2));
  }

  public ComplexNumber div() {
    int c2RealPow = (int) Math.pow(real2, 2);
    int c2ImaginaryPow = (int) Math.pow(imaginary2, 2);
    return new ComplexNumber(
        ((real1 * real2 + imaginary1 * imaginary2) / (c2RealPow + c2ImaginaryPow)),
        ((imaginary1 * real2 - real1 * imaginary2) / (c2RealPow + c2ImaginaryPow)));
  }
}
