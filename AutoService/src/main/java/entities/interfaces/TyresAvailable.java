package entities.interfaces;

public interface TyresAvailable {
    default void updateTyre() {
        System.out.println("Updating tyre is not available for this type of transport.");
    }
}
