package entities;

import lombok.Getter;

@Getter
public abstract class Transport {
    protected String modelName;
    protected int wheelsCount;
    protected Transport(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }
    public abstract void updateTyre();
    public abstract void checkEngine();
    public abstract void checkTrailer();
    protected void serviceInvalid(String service) {
        System.out.printf("The service (%s) is not available for this type of transport.\n", service);
    }

}
