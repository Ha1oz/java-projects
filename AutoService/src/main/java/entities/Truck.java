package entities;

import entities.interfaces.EngineAvailable;
import entities.interfaces.TrailerAvailable;
import entities.interfaces.TyresAvailable;

public class Truck extends Transport implements TyresAvailable, EngineAvailable, TrailerAvailable {
    public Truck(String modelName, int wheelsCount) {
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
    public void checkTrailer() {
        System.out.println("Checking the trailer...");
    }
    @Override
    public void serveTransport() {
        for (int i = 0; i < this.getWheelsCount(); i++) {
            updateTyre();
        }
        checkEngine();
        checkTrailer();
    }

}
