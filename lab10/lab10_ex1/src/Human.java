public final class Human extends Animal {
    public String name = null;
    public Boolean isAlive = false;

    @Override
    public String bear(){
        isAlive = true;
        return "The Human Bob was born";
    }
    @Override
    public String die(){
        isAlive = false;
        return "The human Bob is died";
    }
}
