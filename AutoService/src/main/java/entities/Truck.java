package entities;

import entities.interfaces.EngineAvailable;
import entities.interfaces.TrailerAvailable;
import entities.interfaces.TyresAvailable;

public record Truck(String modelName, int wheelsCount) implements TyresAvailable, EngineAvailable, TrailerAvailable {
    @Override
    public void updateTyre() {
        System.out.println("Changing the tire...");
    }
    @Override
    public void checkEngine() {
        System.out.println("Checking the engine...");
    }
    @Override
    public void checkTrailer() {
        System.out.println("Checking the trailer...");
    }
    @Override
    public void serveTransport() {
        for (int i = 0; i < this.wheelsCount(); i++) {
            updateTyre();
        }
        checkEngine();
        checkTrailer();
    }
}
