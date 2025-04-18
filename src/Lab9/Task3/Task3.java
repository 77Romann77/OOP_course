package Lab9.Task3;

public class Task3 {
    public static void main(String[] args) {
        Circle circle = new Circle();
        Square square = new Square();
        Triangle triangle = new Triangle();

        Shape[] shapes = new Shape[3];

        shapes[0] = circle;
        shapes[1] = square;
        shapes[2] = triangle;

        for (Shape shape : shapes) {
            shape.draw();
        }
    }
}
