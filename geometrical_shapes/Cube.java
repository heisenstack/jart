package geometrical_shapes;

import java.awt.Color;

public class Cube implements Drawable {
    private Point topLeft;
    private Point bottomRight;
    private int depth;
    private Color color;

    public Cube(Point topLeft, Point bottomRight, int depth, Color color) {
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
        this.depth = depth;
        this.color = color;
    }

    @Override
    public void draw(Displayable displayable) {
        Rectangle frontFace = new Rectangle(topLeft, bottomRight, color);
        frontFace.draw(displayable);

        Point backTopLeft = new Point(topLeft.getX() + depth, topLeft.getY() - depth);
        Point backBottomRight = new Point(bottomRight.getX() + depth, bottomRight.getY() - depth);
        Rectangle backFace = new Rectangle(backTopLeft, backBottomRight, color);
        backFace.draw(displayable);

        Point frontTopRight = new Point(bottomRight.getX(), topLeft.getY());
        Point backTopRight = new Point(backBottomRight.getX(), backTopLeft.getY());
        Point frontBottomLeft = new Point(topLeft.getX(), bottomRight.getY());
        Point backBottomLeft = new Point(backTopLeft.getX(), backBottomRight.getY());

        new Line(topLeft, backTopLeft, color).draw(displayable);
        new Line(frontTopRight, backTopRight, color).draw(displayable);
        new Line(frontBottomLeft, backBottomLeft, color).draw(displayable);
        new Line(bottomRight, backBottomRight, color).draw(displayable);
    }

    @Override
    public Color getColor() {
        return color;
    }
}