package entities.faculty;

import entities.HogwartsFaculty;
import entities.quality.Characteristic;
import entities.quality.SkillNature;

public class Gryffindor extends HogwartsFaculty {

    public Gryffindor() {
        super(SkillNature.GRYFFINDOR);
        name = "Gryffindor";
    }
    @Override
    public String toString() {
        return name;
    }
}
