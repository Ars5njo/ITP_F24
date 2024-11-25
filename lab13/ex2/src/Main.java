import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void displayAnimals(Set<? extends Animal> animals) {
        for (Animal animal : animals) {
            System.out.println(animal.nickname);
        }
    }

    public static void makeTalk(Set<? extends Animal> animals) {
        for (Animal animal : animals) {
            animal.voice();
        }
    }

    public static void addAnimals(Set<? super Animal> animals, Animal animal) {
        animals.add(animal);
    }

    public static void main(String[] args) {
        Set<Cat> cats = new HashSet<>();
        cats.add(new Cat("Tom", 10));
        cats.add(new Cat("Kitty", 7));

        Set<Dog> dogs = new HashSet<>();
        dogs.add(new Dog("Rex", 12));
        dogs.add(new Dog("Buddy", 8));

        displayAnimals(cats);
        makeTalk(dogs);

        Set<Animal> animals = new HashSet<>();
        addAnimals(animals, new Dog("Max", 15));
        addAnimals(animals, new Cat("Luna", 9));

        displayAnimals(animals);
        makeTalk(animals);
    }
}