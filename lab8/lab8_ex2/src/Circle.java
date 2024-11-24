public class Circle extends Shape {
    String name;
    double radius;


    Circle(String name, double radius) {
        this.name = name;
        this.radius = radius;
    }


    @Override
    public String showName(){
        return name;
    }

    @Override
    public double Area(){
        return 3.14 * radius * radius;
    }

    @Override
    public double Perimeter(){
        return 2 * 3.14 * radius;
    }
}
