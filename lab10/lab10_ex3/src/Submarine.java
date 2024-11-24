public class Submarine implements Swimmable {
    boolean isSwimming = false;

    @Override
    public void swim() {
        isSwimming = true;
        System.out.println("Submarine is swimming");
    }

    @Override
    public void stopSwimming() {
        if(!isSwimming)
            System.out.println("Submarine is not swimming already");
        else {
            System.out.println("Submarine is not swimming now");
            isSwimming = false;
        }
    }
}
