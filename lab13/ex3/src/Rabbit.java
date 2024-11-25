class Rabbit extends Animal {
    int earLength;

    public Rabbit(int id, String nickname, Owner owner, int earLength) {
        super(id, nickname, owner);
        this.earLength = earLength;
    }

    @Override
    void displayInfo() {
        System.out.println("Rabbit [ID: " + id + ", Nickname: " + nickname + ", Owner: " + owner +
                ", Ear Length: " + earLength + "]");
    }
}

