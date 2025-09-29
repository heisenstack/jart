import geometrical_shapes.*;
import java.awt.Color;

public class Main {
    public static void main(String[] args) {
        Image image = new Image(1000, 1000);
        Rectangle rectangle = new Rectangle(new Point(30, 10), new Point(300, 200));
        rectangle.draw(image);
        Triangle triangle = new Triangle(new Point(100, 100), new Point(900, 900), new Point(100, 900));
        triangle.draw(image);

        Point p1 = new Point(500, 100);
        Point p2 = new Point(700, 300);
        Point p3 = new Point(600, 600);
        Point p4 = new Point(400, 600);
        Point p5 = new Point(300, 300);
        Pentagon pentagon = new Pentagon(p1, p2, p3, p4, p5);
        pentagon.draw(image);
        Cube cube = new Cube(Point.random(1000, 1000), Point.random(1000, 1000), 50, Color.BLUE);
        cube.draw(image);
        for (int i = 0; i < 150; i++) {
            Circle circle = Circle.random(image.getWidth() * 2, image.getHeight() * 2);
            circle.draw(image);
        }
        image.save("image.png");
    }
}