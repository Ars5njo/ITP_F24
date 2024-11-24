public class InterfaceDemonstration {
    public static void main(String[] args) {
        Submarine submarine = new Submarine();
        submarine.swim();
        submarine.stopSwimming();
        System.out.println("\n");


        Duck duck = new Duck();
        duck.swim();
        duck.stopSwimming();
        duck.stopSwimming();
        duck.fly();
        duck.stopSwimming();
        duck.live("Duck");
        System.out.println("\n");


        Penguin penguin = new Penguin();
        penguin.swim();
        penguin.stopSwimming();
        penguin.live("Penguin");
        System.out.println("\n");
    }
}