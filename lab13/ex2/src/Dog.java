class Dog extends Animal {
    int barkingLoudness;

    public Dog(String nickname, int barkingLoudness) {
        super(nickname);
        this.barkingLoudness = barkingLoudness;
    }

    @Override
    void voice() {
        System.out.println(nickname + " says: Woof (loudness " + barkingLoudness + ")");
    }
}
