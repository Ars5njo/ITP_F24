public class Square extends Shape {
    String name;
    double side1;


    Square(String name, double side1){
        this.name = name;
        this.side1 = side1;
    }


    @Override
    public String showName(){
        return name;
    }

    @Override
    public double Area(){
        return side1 * side1;
    }

    @Override
    public double Perimeter(){
        return 2 * (side1 + side1);
    }
}
