public class Triangle extends Shape {
    String name;
    double side1;
    double side2;
    double side3;


    Triangle(String name, double side1, double side2, double side3) {
        this.name = name;
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }


    @Override
    public String showName(){
        return name;
    }

    @Override
    public double Area(){
        double hp = ((side1 + side2 + side3) / 2);
        return Math.sqrt(hp * (hp - side1) * (hp - side2) * (hp - side3));
    }

    @Override
    public double Perimeter(){
        return side1 + side2 + side3;
    }
}
