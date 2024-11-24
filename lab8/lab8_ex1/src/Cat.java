class Cat extends Animal{
    Cat(String name, double height, double weight, String color){
        super(name, height, weight, color);
    }


    @Override
    void makeSound(){
        System.out.println(name + " is saying meow");
    }
}
