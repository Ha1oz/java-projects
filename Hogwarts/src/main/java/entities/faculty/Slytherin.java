package entities.faculty;

import entities.HogwartsFaculty;
import entities.quality.Characteristic;

public class Slytherin extends HogwartsFaculty {
    public Slytherin() {
        super();
        name = "Slytherin";
    }
    @Override
    protected void setFacultyCharacteristics() {
        characteristics.add(Characteristic.CUNNING);
        characteristics.add(Characteristic.DETERMINATION);
        characteristics.add(Characteristic.AMBITION);
        characteristics.add(Characteristic.INGENUITY);
        characteristics.add(Characteristic.AUTHORITY);
    }
    @Override
    public String toString() {
        return name;
    }
}
