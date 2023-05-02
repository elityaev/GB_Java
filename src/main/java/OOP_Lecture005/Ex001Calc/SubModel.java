package OOP_Lecture005.Ex001Calc;

public class SubModel extends CalcModel{

    public SubModel() {

    }

    @Override
    public int result() {
        return x + y;
    }

    @Override
    public void setX(int value) {
        super.x = value;
    }

    @Override
    public void setY(int value) {
        super.y = value;
    }
}
