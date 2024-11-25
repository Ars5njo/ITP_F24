class Cat extends Animal {
    int purLoudness;

    public Cat(int id, String nickname, Owner owner, int purLoudness) {
        super(id, nickname, owner);
        this.purLoudness = purLoudness;
    }

    @Override
    void displayInfo() {
        System.out.println("Cat [ID: " + id + ", Nickname: " + nickname + ", Owner: " + owner +
                ", Pur Loudness: " + purLoudness + "]");
    }
}
