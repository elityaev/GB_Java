package Calculator;

import Calculator.Model.CalcModel;
import Calculator.Model.ComplexCalcModel;
import Calculator.Model.RealCalcModel;
import Calculator.Number.ComplexNumber;
import Calculator.Number.RealNumber;
import Calculator.View.ComplexView;
import Calculator.View.RealView;

public class Program {
  public static void main(String[] args) {

    //    RealNumber realNumber = new RealNumber(2);
    //    RealNumber realNumber1 = new RealNumber(5);
    //    RealCalcModel realCalcModel = new RealCalcModel (realNumber, realNumber1);
    //    System.out.println(realCalcModel.sum());
    //
    //    ComplexNumber complexNumber = new ComplexNumber(2, 5);
    //    ComplexNumber complexNumber1 = new ComplexNumber(4, 7);
    //    ComplexCalcModel complexCalcModel = new ComplexCalcModel(complexNumber, complexNumber1);
    //    System.out.println(complexCalcModel.sum());

    //    RealCalcModel realCalcModel1 = new RealCalcModel();
    //    realCalcModel1.setNumberX(realNumber);
    //    realCalcModel1.setNumberY(realNumber1);
    //    System.out.println(realCalcModel1.sum());
    //
    //    ComplexCalcModel complexCalcModel = new ComplexCalcModel();
    //    complexCalcModel.setNumberX(complexNumber);
    //    complexCalcModel.setNumberY(complexNumber1);
    //    System.out.println(complexCalcModel.sum());
//        Presenter<RealCalcModel, RealView> realCalcModelRealViewPresenter =
//            new Presenter<>(new RealCalcModel(), new RealView());
//        realCalcModelRealViewPresenter.buttonClick();
//    Presenter<ComplexCalcModel, ComplexView> complexCalcModelRealViewPresenter =
//        new Presenter<>(new ComplexCalcModel(), new ComplexView());
//    complexCalcModelRealViewPresenter.buttonClick();

      Presenter realViewPresenter = new Presenter();
      realViewPresenter.buttonClick();
  }
}
