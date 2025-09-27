package shapes;
import java.awt.Color;
import java.util.Random;

public class Point implements Drawable {
    private int x, y;
    private Color color;
    private static Random random = new Random();
    
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
        this.color = generateRandomColor();
    }
    
    public int getX() { return x; }
    public int getY() { return y; }
    
    @Override
    public Color getColor() { return color; }
    
    @Override
    public void draw(Displayable displayable) {
        displayable.display(x, y, color);
    }
    
    public static Point random(int maxWidth, int maxHeight) {
        return new Point(random.nextInt(maxWidth), random.nextInt(maxHeight));
    }
    
    private Color generateRandomColor() {
        return new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256));
    }
}