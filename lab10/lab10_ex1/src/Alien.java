public class Alien extends Creature {
    private String name;
    private Boolean isAlive;

    @Override
    public String bear(){
        isAlive = true;
        return "The Human BLUBLUB was born";
    }
    @Override
    public String die(){
        isAlive = false;
        return "The human BLUBLUB is died";
    }
}
