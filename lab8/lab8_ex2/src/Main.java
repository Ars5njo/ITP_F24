public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[5];


        shapes[0] = new Circle("Cirle", 3.0);
        shapes[1] = new Rectangle("Rectangle", 7.5, 9);
        shapes[2] = new Triangle("Triangle", 7.5, 9, 10);
        shapes[3] = new Square("Square", 5.5);
        shapes[4] = new Ellipse("Ellipse", 10.5, 14.0);


        for(int i = 0; i < 5; i++) {
            System.out.println(shapes[i].showName() + ":\n"
                    + "Area: " + shapes[i].Area() + "\n"
                    + "Perimeter: " + shapes[i].Perimeter() + "\n\n");
        }
    }
}