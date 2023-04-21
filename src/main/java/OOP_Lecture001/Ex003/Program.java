package OOP_Lecture001.Ex003;

public class Program {
    public static void main(String[] args){
        Point2D a = new Point2D(0, 2);

    System.out.println(a.getX());

        Point2D b = new Point2D(10);
        System.out.println(b);

        Point2D c = new Point2D();
        System.out.println(c);

        var dis = Point2D.distance(a, b);
        System.out.println(dis);
  }
}
