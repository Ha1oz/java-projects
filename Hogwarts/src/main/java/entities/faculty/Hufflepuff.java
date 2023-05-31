package entities.faculty;

import entities.HogwartsFaculty;
import entities.quality.Characteristic;

public class Hufflepuff extends HogwartsFaculty {
    public Hufflepuff() {
        super();
        name = "Hufflepuff";
    }
    @Override
    protected void setFacultyCharacteristics() {
        characteristics.add(Characteristic.DILIGENCE);
        characteristics.add(Characteristic.LOYALTY);
        characteristics.add(Characteristic.HONESTY);
    }
    @Override
    public String toString() {
        return name;
    }
}
