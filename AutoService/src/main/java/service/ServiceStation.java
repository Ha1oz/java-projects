package service;

import entities.Transport;
import lombok.NonNull;

public class ServiceStation {
    @NonNull
    public void check(Transport transport) {
        System.out.printf("\nServing %s:\n", transport.getModelName());
        for (int i = 0; i < transport.getWheelsCount(); i++) {
            transport.updateTyre();
        }
        transport.checkEngine();
        transport.checkTrailer();
    }
}
