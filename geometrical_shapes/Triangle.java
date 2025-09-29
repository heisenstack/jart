package geometrical_shapes;

import java.awt.Color;

public class Triangle extends Polygon {
    public Triangle(Point p1, Point p2, Point p3) {
        this(p1, p2, p3, Color.BLUE);
    }

    public Triangle(Point p1, Point p2, Point p3, Color color) {
        super(new Point[] { p1, p2, p3 }, color);
    }
}
