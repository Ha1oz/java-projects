package entities;

import entities.interfaces.TyresAvailable;

public record Bicycle(String modelName, int wheelsCount) implements TyresAvailable {
    @Override
    public void updateTyre() {
        System.out.println("Changing the tire...");
    }

    @Override
    public void serveTransport() {
        for (int i = 0; i < this.wheelsCount(); i++) {
            updateTyre();
        }
    }
}
