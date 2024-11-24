public class Penguin implements Swimmable, Living {
    boolean isSwimming;

    @Override
    public void swim() {
        System.out.println("Penguin is swimming");
        isSwimming = true;
    }
    @Override
    public void stopSwimming() {
        if (!isSwimming)
            System.out.println("Penguin is not swimming already");
        else {
            System.out.println("Penguin is not swimming now");
            isSwimming = false;
        }
    }
}
