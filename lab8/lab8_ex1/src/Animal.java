class Animal{
    String name;
    double height;
    double weight;
    String color;


    Animal(String name, double height, double weight, String color){
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.color = color;
    }


    void eat(){
        System.out.println( name + " is eating...");
    }

    void sleep(){
        System.out.println(name + " is sleeping...");
    }

    void makeSound(){
        System.out.println(name + " is making sound...");
    }
}
