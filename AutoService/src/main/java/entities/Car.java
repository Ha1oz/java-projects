package entities;

import entities.interfaces.EngineAvailable;
import entities.interfaces.TyresAvailable;

public record Car(String modelName, int wheelsCount) implements TyresAvailable, EngineAvailable {
    @Override
    public void updateTyre() {
        System.out.println("Changing the tire...");
    }

    @Override
    public void checkEngine() {
        System.out.println("Checking the engine...");
    }

    @Override
    public void serveTransport() {
        for (int i = 0; i < this.wheelsCount(); i++) {
            updateTyre();
        }
        checkEngine();
    }
}
