import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            list.add(random.nextInt(201) - 100);
        }
        list.add(-3);
        System.out.println(list);
        list.stream()
                .filter(x -> x % 3 == 0)
                .map(Math::abs)
                .forEach(System.out::println);
    }
}