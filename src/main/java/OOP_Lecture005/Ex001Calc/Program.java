package OOP_Lecture005.Ex001Calc;

public class Program {
    public static void main(String[] args){
        Presenter p = new Presenter(new SubModel(), new View());
        p.buttonClick();
    }
}
