package OOP_Seminar005;

import java.util.Scanner;

public class Program {

  public static void main(String[] args) {
    View view = new View();
    int selection;
    Scanner input = new Scanner(System.in);
    System.out.println("С какими числами вы будете производить операции");
    System.out.println("-------------------------\n");
    System.out.println("1 - с вещественными");
    System.out.println("2 - с комплексными");
    System.out.println("3 - прервать выполнение");

    selection = input.nextInt();

    switch (selection) {
      case 1:
        int x;
        int y;
        System.out.println("Введите число x");
        x = input.nextInt();
        System.out.println("Введите число y");
        y = input.nextInt();
        CalculateReal calculateReal = new CalculateReal(x, y);
        System.out.println("Какую операцию вы будете производить");
        System.out.println("-------------------------\n");
        System.out.println("1: сложение");
        System.out.println("2: вычитание");
        System.out.println("3: умножение");
        System.out.println("4: деление");

        selection = input.nextInt();

        switch (selection) {
          case 1:
            view.print(calculateReal.sum(), "Sum: ");
            break;
          case 2:
            view.print(calculateReal.diff(), "Diff: ");
            break;
          case 3:
            view.print(calculateReal.mult(), "Mult: ");
            break;
          case 4:
            view.print(calculateReal.div(), "Div: ");
            break;
          default:
            break;
        }
      case 2:
        double real1;
        double imaginary1;
        double real2;
        double imaginary2;
        System.out.println("Введите число x");
        real1 = input.nextDouble();
        System.out.println("Введите мнимую часть числа x");
        imaginary1 = input.nextDouble();
        System.out.println("Введите число y");
        real2 = input.nextDouble();
        System.out.println("Введите мнимую часть числа y");
        imaginary2 = input.nextDouble();
        CalculateComplex calculateComplex =
            new CalculateComplex(real1, imaginary1, real2, imaginary2);

        System.out.println("Какую операцию вы будете производить");
        System.out.println("-------------------------\n");
        System.out.println("1: сложение");
        System.out.println("2: вычитание");
        System.out.println("3: умножение");
        System.out.println("4: деление");

        selection = input.nextInt();

        switch (selection) {
          case 1:
            System.out.println(calculateComplex.sum());
            break;
          case 2:
            System.out.println(calculateComplex.diff());
            break;
          case 3:
            System.out.println(calculateComplex.mult());
            break;
          case 4:
            System.out.println(calculateComplex.div());
            break;
          default:
            break;
        }
    }
  }
}
