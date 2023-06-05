package entities;

import entities.interfaces.EngineAvailable;
import entities.interfaces.TyresAvailable;

public class Car extends Transport implements TyresAvailable, EngineAvailable {
    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }
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
        for (int i = 0; i < this.getWheelsCount(); i++) {
            updateTyre();
        }
        checkEngine();
    }
}
