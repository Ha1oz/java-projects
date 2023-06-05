package entities;

import entities.interfaces.TyresAvailable;

public class Bicycle extends Transport implements TyresAvailable {
    public Bicycle(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }
    @Override
    public void updateTyre() {
        System.out.println("Changing the tire...");
    }
    @Override
    public void serveTransport() {
        for (int i = 0; i < this.getWheelsCount(); i++) {
            updateTyre();
        }
    }
}
