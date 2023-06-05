package entities.interfaces;

public interface EngineAvailable {
    default void checkEngine() {
        System.out.println("Checking engine is not available for this type of transport.");
    }
}
