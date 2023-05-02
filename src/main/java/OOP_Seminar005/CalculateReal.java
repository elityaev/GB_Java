package OOP_Seminar005;

public class CalculateReal {
  int n1;
  int n2;

  public CalculateReal(int n1, int n2) {
    this.n1 = n1;
    this.n2 = n2;
  }

  public int sum() {
    return n1 + n2;
  }

  public int diff() {
    return n1 - n2;
  }

  public int mult() {
    return n1 * n2;
  }

  public int div() {
    return n1 / n2;
  }
}
