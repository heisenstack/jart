package geometrical_shapes;

import java.awt.Color;
import java.util.Random;

public class Line implements Drawable {
    private Point start;
    private Point end;
    private Color color;
    private static Random random = new Random();
    
    public Line(Point start, Point end) {
        this.start = start;
        this.end = end;
        this.color = Color.BLACK;
    }
    
    public Line(Point start, Point end, Color color) {
        this.start = start;
        this.end = end;
        this.color = color;
    }
    
    public static Line random(int maxWidth, int maxHeight) {
        Point start = Point.random(maxWidth, maxHeight);
        Point end = Point.random(maxWidth, maxHeight);
        Color randomColor = new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256));
        return new Line(start, end, randomColor);
    }
    
    @Override
    public void draw(Displayable displayable) {

        int x1 = start.getX();
        int y1 = start.getY();
        int x2 = end.getX();
        int y2 = end.getY();
        
        int dx = Math.abs(x2 - x1);
        int dy = Math.abs(y2 - y1);
        int steps = Math.max(dx, dy);
        
        if (steps == 0) {
            displayable.display(x1, y1, color);
            return;
        }
        
        double xIncrement = (double)(x2 - x1) / steps;
        double yIncrement = (double)(y2 - y1) / steps;
        
        for (int i = 0; i <= steps; i++) {
            int x = (int)(x1 + i * xIncrement);
            int y = (int)(y1 + i * yIncrement);
            displayable.display(x, y, color);
        }
    }
    
    @Override
    public Color getColor() {
        return color;
    }
}
