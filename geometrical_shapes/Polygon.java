package geometrical_shapes;

import java.awt.Color;

public class Polygon implements Drawable {
    private Point[] vertices;
    private Color color;

    public Polygon(Point[] vertices, Color color) {
        this.vertices = vertices;
        this.color = color;
    }

    public Polygon(Point[] vertices) {
        this(vertices, Color.BLACK); 
    }

    @Override
    public void draw(Displayable displayable) {
        for (int i = 0; i < vertices.length; i++) {
            Point start = vertices[i];
            Point end = vertices[(i + 1) % vertices.length]; 
            Line side = new Line(start, end, color);
            side.draw(displayable);
        }
    }

    @Override
    public Color getColor() {
        return color;
    }
}
