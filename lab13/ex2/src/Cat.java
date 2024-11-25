class Cat extends Animal {
    int purLoudness;

    public Cat(String nickname, int purLoudness) {
        super(nickname);
        this.purLoudness = purLoudness;
    }

    @Override
    void voice() {
        System.out.println(nickname + " says: Meow (loudness " + purLoudness + ")");
    }
}
