package shapes;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class Image implements Displayable {
    private BufferedImage image;
    private Graphics2D graphics;
    private int width, height;
    
    public Image(int width, int height) {
        this.width = width;
        this.height = height;
        this.image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        this.graphics = image.createGraphics();
        this.graphics.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        
        this.graphics.setColor(Color.BLACK);
        this.graphics.fillRect(0, 0, width, height);
    }
    
    public int getWidth() { return width; }
    public int getHeight() { return height; }
    
    @Override
    public void display(int x, int y, Color color) {
        graphics.setColor(color);
        graphics.fillOval(x, y, 2, 2); 
    }
    
    @Override
    public void save(String filename) {
        try {
            ImageIO.write(image, "png", new File(filename));
            System.out.println("Image saved as " + filename);
        } catch (IOException e) {
            System.err.println("Error saving image: " + e.getMessage());
        }
    }
    
    public Graphics2D getGraphics() {
        return graphics;
    }
}