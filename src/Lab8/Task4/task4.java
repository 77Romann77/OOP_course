package Lab8.Task4;

public class task4 {
    public static void main(String[] args) {
        Shape shape = new Shape();
        Circle circle = new Circle(3);
        Rectangle rectangle = new Rectangle(2.0, 4.0);

        System.out.println(shape.area());
        System.out.println(circle.area());
        System.out.println(rectangle.area());
    }
}
