package entities;

import lombok.Getter;

@Getter
public abstract class Transport {
    private final String modelName;
    private final int wheelsCount;
    protected Transport(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }
    public abstract void serveTransport();
}
