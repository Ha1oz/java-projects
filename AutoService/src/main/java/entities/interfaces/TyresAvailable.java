package entities.interfaces;

public interface TyresAvailable extends Transport{
    default void updateTyre() {
        System.out.println("Updating tyre is not available for this type of transport.");
    }
}
