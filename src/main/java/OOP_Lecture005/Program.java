package OOP_Lecture005;

public class Program {
  public static void main(String[] args) {
    Number a = new Number(2);
    Number b = new Number(3);
    Addition summ = new Addition(a, b);
    System.out.println(summ.addition());
  }
}
