public class Ellipse extends Shape {
    String name;
    double side1;
    double side2;


    Ellipse(String name, double side1, double side2) {
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
        return 3.14 * side1 * side2;
    }

    @Override
    public double Perimeter(){
        return 2 * 3.14 * Math.sqrt((side1 * side1 + side2 * side2) / 2);
    }
}
