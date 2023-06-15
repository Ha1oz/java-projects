package service;

import entities.interfaces.Transport;
import lombok.NonNull;

public class ServiceStation {
    @NonNull
    public void check(Transport transport) {
        System.out.printf("\nServing %s:\n", transport.modelName());
        transport.serveTransport();
    }
}
