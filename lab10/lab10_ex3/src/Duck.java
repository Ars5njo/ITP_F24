public class Duck implements Swimmable, Flyable, Living {
    boolean isSwimming = false;
    boolean isFlying = false;

    @Override
    public void swim() {
        System.out.println("Duck is swimming");
        isSwimming = true;
    }
    @Override
    public void stopSwimming() {
        if(!isSwimming)
            System.out.println("Duck is not swimming already");
        else {
            System.out.println("Duck is not swimming now");
            isSwimming = false;
        }
    }


    @Override
    public void fly() {
        isFlying = true;
        System.out.println("Duck is flying");
    }
    @Override
    public void stopFlying() {
        if(!isFlying)
            System.out.println("Duck is not flying already");
        else {
            System.out.println("Duck is not flying now");
            isFlying = false;
        }
    }
}
