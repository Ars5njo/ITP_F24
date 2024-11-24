 import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(new Cat("Dog", 10.5, 10, "red"));
        animals.add(new Dog("Dog", 10.5, 10, "red"));
        animals.add(new Cow("Cow", 10, 10, "blue"));

        for(Animal animal : animals){
            animal.eat();
            animal.sleep();
            animal.makeSound();
            System.out.println("\n");
        }
    }
}