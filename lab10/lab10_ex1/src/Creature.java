abstract class Creature {
    public String name = null;
    public Boolean isAlive = false;

    public void shoutName(){
        if(name != null)
            System.out.println("The name of the animal is " + name);
        else
            System.out.println("Error name");
    }

    abstract String bear();
    abstract String die();
}
