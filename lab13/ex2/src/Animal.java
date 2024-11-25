import java.util.Objects;

abstract class Animal {
    String nickname;

    public Animal(String nickname) {
        this.nickname = nickname;
    }

    abstract void voice();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return Objects.equals(nickname, animal.nickname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nickname);
    }
}
