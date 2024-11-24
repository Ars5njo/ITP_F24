public final class Dog extends Animal {
    private String name;
    private Boolean isAlive;

    public String bark(){
        return "The Dog barks";
    }

    @Override
    public String bear(){
        isAlive = true;
        return "The Dog Sharik was born";
    }
    @Override
    public String die(){
        isAlive = false;
        return "The Dog Sharik is died";
    }
}
