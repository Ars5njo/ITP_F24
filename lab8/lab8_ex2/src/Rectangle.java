public class Rectangle extends Shape {
    String name;
    double side1;
    double side2;


    Rectangle(String name, double side1, double side2) {
        this.name = name;
        this.side1 = side1;
        this.side2 = side2;
    }


    @Override
    public String showName(){
        return name;
    }

    @Override
    public double Area(){
        return side1 * side2;
    }

    @Override
    public double Perimeter(){
        return 2 * (side1 + side2);
    }
}
