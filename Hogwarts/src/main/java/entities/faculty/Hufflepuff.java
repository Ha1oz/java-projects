package entities.faculty;

import entities.HogwartsFaculty;
import entities.quality.Characteristic;
import entities.quality.SkillNature;

public class Hufflepuff extends HogwartsFaculty {
    public Hufflepuff() {
        super(SkillNature.HUFFLEPUFF);
        name = "Hufflepuff";
    }
    @Override
    public String toString() {
        return name;
    }
}
