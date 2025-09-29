package geometrical_shapes;

import java.awt.Color;
import java.util.Random;

public class Point implements Drawable {
    private int x;
    private int y;
    private Color color;
    private static Random random = new Random();
    
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
        this.color = Color.BLACK;
    }
    
    public Point(int x, int y, Color color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }
    
    public static Point random(int maxWidth, int maxHeight) {
        int x = random.nextInt(maxWidth);
        int y = random.nextInt(maxHeight);
        Color randomColor = new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256));
        return new Point(x, y, randomColor);
    }
    
    public int getX() {
        return x;
    }
    
    public int getY() {
        return y;
    }
    
    @Override
    public void draw(Displayable displayable) {
        displayable.display(x, y, color);
    }
    
    @Override
    public Color getColor() {
        return color;
    }
}
