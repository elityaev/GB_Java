package Calculator;

import Calculator.Model.CalcModel;
import Calculator.Number.CalcNumber;
import Calculator.View.View;

import java.util.List;

public class Presenter {

    public void buttonClick() {
        Dispatcher dispatcher = new Dispatcher();
        List conf = dispatcher.getConf();
        CalcModel model = (CalcModel) conf.get(0);
        View view = (View) conf.get(1);

        model.setNumberX(view.getValue("x: "));
        model.setNumberY(view.getValue("y: "));

        String operator = dispatcher.getOperation();
        CalcNumber result = model.getOperation(operator);
        view.print(result, "Sum: ");

    }
}
