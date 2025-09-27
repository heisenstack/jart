import shapes.*;

public class Main {
    public static void main(String[] args) {
        Image image = new Image(1000, 1000);
        
        for (int i = 0; i < 50; i++) {
            Point point = Point.random(image.getWidth(), image.getHeight());
            point.draw(image);
        }
        
        image.save("image.png");
        System.out.println("Image rendered!");
    }
}