import java.util.HashMap;
import java.util.Map;

public class VeterinaryClinic {
    private Map<Integer, Animal> animals = new HashMap<>();

    public void addPet(Animal animal) {
        if (animals.containsKey(animal.id)) {
            System.out.println("Animal with ID " + animal.id + " already exists!");
        } else {
            animals.put(animal.id, animal);
            System.out.println("Animal added: " + animal.nickname);
        }
    }

    public void displayPets() {
        for (Animal animal : animals.values()) {
            animal.displayInfo();
        }
    }

    public static void main(String[] args) {
        VeterinaryClinic clinic = new VeterinaryClinic();

        Owner john = new Owner("John", "Doe", 30);
        Owner jane = new Owner("Jane", "Smith", 25);

        clinic.addPet(new Cat(1, "Whiskers", john, 5));
        clinic.addPet(new Snake(2, "Slytherin", jane, 3));
        clinic.addPet(new Rabbit(3, "Floppy", john, 12));
        clinic.addPet(new Cat(1, "Duplicate", jane, 10)); // Duplicate ID

        clinic.displayPets();
    }
}