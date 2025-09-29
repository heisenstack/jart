package geometrical_shapes;

import java.awt.Color;

public class Rectangle extends Polygon {
    public Rectangle(Point topLeft, Point bottomRight) {
        this(topLeft, bottomRight, Color.RED);
    }

    public Rectangle(Point topLeft, Point bottomRight, Color color) {
        super(
            new Point[] {
                topLeft,
                new Point(bottomRight.getX(), topLeft.getY()),   
                bottomRight,
                new Point(topLeft.getX(), bottomRight.getY())    
            },
            color
        );
    }
}
