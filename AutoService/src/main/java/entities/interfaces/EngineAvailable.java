package entities.interfaces;

public interface EngineAvailable extends Transport{
    default void checkEngine() {
        System.out.println("Checking engine is not available for this type of transport.");
    }
}
