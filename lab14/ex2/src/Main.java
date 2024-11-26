import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("welkgnwerjjgwutr8924u3t0yu3erygibjkfw");
        list.add("kwejdfhlo3i2e89r2u03yr");
        list.add("adjglksjdgkljdaklgSGHSKLJGFSgsfdgs");
        list.add("dmglkjhqe123890opkdmkvlJKSHKJGHSKJ");
        list.add("sdngjkwdklkmKNJKSGJNKLSNBJKSwmgklsdjfnhbjks");
        list.add("dlvljkdwhbklebvjqh12345678iuygfvbpo9876trfgbndnfjbh");
        list.add("welkgnwerjjgwutr8924u3t0yu3erygibjkfw");
        list.add("kwejdfhlo3i2e89r2u03yr");
        list.add("adjglksjdgkljdaklgSGHSKLJGFSgsfdgs");
        list.add("");
        list.addAll(list);
        System.out.println(list);
        list.stream()
                .distinct()
                .sorted()
                .filter(x -> x.matches("[a-zA-Z]+"))
                .forEach(System.out::println);
    }
}