package entities.faculty;

import entities.HogwartsFaculty;
import entities.quality.Characteristic;
import entities.quality.SkillNature;

public class Ravenclaw extends HogwartsFaculty {
    public Ravenclaw() {
        super(SkillNature.RAVENCLAW);
        name = "Ravenclaw";
    }
    @Override
    public String toString() {
        return name;
    }
}
