public class ColorableTest {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] =(Circle) new Circle();
        shapes[1] = (Square) new Square();
        shapes[2] = (Rectangle) new Rectangle();
        for (Shape shape: shapes) {
            if (shape instanceof Square) {
                System.out.println(shape);
                ((Square) shape).howtoColor();
            } else System.out.println(shape);
        }

    }
}
