public interface Living {
    public default void live(String Class){
        System.out.println(Class + " lives");
    }
}
