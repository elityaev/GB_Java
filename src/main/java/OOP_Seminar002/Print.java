package OOP_Seminar002;

public interface Print {

    default void print(String text) {
        System.out.println(text);
    }
}
