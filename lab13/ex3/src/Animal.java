abstract class Animal {
    int id;
    String nickname;
    Owner owner;

    public Animal(int id, String nickname, Owner owner) {
        this.id = id;
        this.nickname = nickname;
        this.owner = owner;
    }

    abstract void displayInfo();
}
