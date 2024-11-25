class Snake extends Animal {
    int levelOfVenomDanger;

    public Snake(int id, String nickname, Owner owner, int levelOfVenomDanger) {
        super(id, nickname, owner);
        this.levelOfVenomDanger = levelOfVenomDanger;
    }

    @Override
    void displayInfo() {
        System.out.println("Snake [ID: " + id + ", Nickname: " + nickname + ", Owner: " + owner +
                ", Venom Level: " + levelOfVenomDanger + "]");
    }
}
