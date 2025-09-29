package geometrical_shapes;

import java.awt.Color;

public class Pentagon extends Polygon {
    public Pentagon(Point p1, Point p2, Point p3, Point p4, Point p5) {
        this(p1, p2, p3, p4, p5, Color.GREEN);
    }

    public Pentagon(Point p1, Point p2, Point p3, Point p4, Point p5, Color color) {
        super(new Point[] { p1, p2, p3, p4, p5 }, color);
    }
}
