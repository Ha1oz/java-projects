package entities.faculty;

import entities.HogwartsFaculty;
import entities.quality.Characteristic;
import entities.quality.SkillNature;

public class Slytherin extends HogwartsFaculty {
    public Slytherin() {
        super(SkillNature.SLYTHERIN);
        name = "Slytherin";
    }
    @Override
    public String toString() {
        return name;
    }
}
