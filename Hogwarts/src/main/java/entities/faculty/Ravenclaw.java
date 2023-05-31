package entities.faculty;

import entities.HogwartsFaculty;
import entities.quality.Characteristic;

public class Ravenclaw extends HogwartsFaculty {
    public Ravenclaw() {
        super();
        name = "Ravenclaw";
    }
    @Override
    protected void setFacultyCharacteristics() {
        characteristics.add(Characteristic.INTELLIGENCE);
        characteristics.add(Characteristic.WISDOM);
        characteristics.add(Characteristic.WIT);
        characteristics.add(Characteristic.CREATIVITY);
    }
    @Override
    public String toString() {
        return name;
    }
}
