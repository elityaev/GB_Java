package OOP_Seminar005;

public interface Calculating<N> {

    N sum();
    N diff();
    N mult();
    N div();



    void setX(N value);

    void setY(N value);
}
