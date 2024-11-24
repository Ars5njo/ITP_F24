class AbtractClassDemonstration {
    public static void main(String[] args) {
        Creature[] creatures = new Creature[3];


        creatures[0] = new Human();
        System.out.println(creatures[0].bear());
        creatures[0].name = "Bob";
        creatures[0].shoutName();
        System.out.println(creatures[0].die() + '\n');


        creatures[1] = new Dog();
        System.out.println(creatures[1].bear());
        creatures[1].name = "Sharik";
        creatures[1].shoutName();
        System.out.println(creatures[1].die() + '\n');


        creatures[2] = new Alien();
        System.out.println(creatures[2].bear());
        creatures[2].name = "BLUBLUB";
        creatures[2].shoutName();
        System.out.println(creatures[2].die() + '\n');
    }
}