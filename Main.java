import shapes.*;

public class Main {
    public static void main(String[] args) {
        Image image = new Image(1000, 1000);
        
        for (int i = 0; i < 50; i++) {
            Point point = Point.random(image.getWidth(), image.getHeight());
            point.draw(image);
        }
        
        image.save("test_points.png");
        System.out.println("Step 1 complete: Basic points rendered!");
    }
}