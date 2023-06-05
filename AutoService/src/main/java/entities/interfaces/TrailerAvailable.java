package entities.interfaces;

public interface TrailerAvailable extends Transport{
    default void checkTrailer() {
        System.out.println("Checking trailer is not available for this type of transport.");
    }
}
