package Calculator;

import Calculator.Model.CalcModel;
import Calculator.Model.ComplexCalcModel;
import Calculator.Model.RealCalcModel;
import Calculator.View.RealView;
import Calculator.View.ComplexView;
import Calculator.View.View;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Dispatcher<C extends CalcModel, V extends View> {
    Scanner in = new Scanner(System.in);
    int selection;

    List getConf() {
        List conf = new ArrayList();
        System.out.println("C какими числами вы будете производить операции");
        System.out.println("-------------------------\n");
        System.out.println("1: с целыми");
        System.out.println("2: с комплексными");
        selection = in.nextInt();
        switch (selection) {
            case 1:
                conf.add(new RealCalcModel());
                conf.add(new RealView());
            case 2:
                conf.add(new ComplexCalcModel());
                conf.add(new ComplexView());
            default:
                break;
        }
        return conf;
    }

    String getOperation() {
        System.out.println("Какую операцию вы будете производить");
        System.out.println("-------------------------\n");
        System.out.println("+: сложение");
        System.out.println("-: вычитание");
        System.out.println("*: умножение");
        System.out.println("/: деление");
        String operator = in.next();
        return operator;
    }
}
