package entities.faculty;

import entities.HogwartsFaculty;
import entities.quality.Characteristic;

public class Gryffindor extends HogwartsFaculty {

    public Gryffindor() {
        super();
        name = "Gryffindor";
    }
    @Override
    protected void setFacultyCharacteristics() {
        characteristics.add(Characteristic.NOBILITY);
        characteristics.add(Characteristic.HONOR);
        characteristics.add(Characteristic.COURAGE);
    }
    @Override
    public String toString() {
        return name;
    }
}
