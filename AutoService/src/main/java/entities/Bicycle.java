package entities;

public class Bicycle extends Transport {
    public Bicycle(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }
    @Override
    public void updateTyre() {
        System.out.println("Changing the tire...");
    }

    @Override
    public void checkEngine() {
        serviceInvalid("Check engine");
    }

    @Override
    public void checkTrailer() {
        serviceInvalid("Check trailer");
    }
}
