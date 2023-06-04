import entities.Bicycle;
import entities.Car;
import entities.Transport;
import entities.Truck;
import service.ServiceStation;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ServiceStation station = new ServiceStation();
        List<Transport> transports = Arrays.asList(
                new Car("car1", 4),
                new Car("car2", 4),
                new Truck("truck1", 6),
                new Truck("truck2", 8),
                new Bicycle("bicycle1", 2),
                new Bicycle("bicycle2", 2)
        );

        for(Transport transport : transports) {
            station.check(transport);
        }
    }
}
