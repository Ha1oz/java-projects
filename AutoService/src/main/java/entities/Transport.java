package entities;

import entities.interfaces.EngineAvailable;
import entities.interfaces.TrailerAvailable;
import entities.interfaces.TyresAvailable;
import lombok.Getter;

@Getter
public abstract class Transport implements TyresAvailable, EngineAvailable, TrailerAvailable{
    private final String modelName;
    private final int wheelsCount;
    protected Transport(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }
}
