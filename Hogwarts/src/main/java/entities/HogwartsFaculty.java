package entities;

import entities.quality.Characteristic;
import entities.quality.Skill;
import entities.quality.SkillNature;
import lombok.NonNull;
import utils.RandomSkillScore;

import java.util.*;

public abstract class HogwartsFaculty {
    private final int BOUND_OF_CHARACTERISTIC_SCORE = 101;
    protected String name;
    protected SkillNature facultySkillNature;
    protected final List<Student> students = new ArrayList<>();
    protected final List<Characteristic> characteristics = new ArrayList<>();
    public HogwartsFaculty(SkillNature skillNature) {
        facultySkillNature = skillNature;
        setFacultyCharacteristics();
    }
    @NonNull
    public void addStudent(Student student) {
        if (students.contains(student)) {
            return;
        }
        students.add(student);
        student.setFaculty(this);
        for (Characteristic characteristic : characteristics) {
            student.addSkills(new Skill(characteristic, RandomSkillScore.setSkillScore(BOUND_OF_CHARACTERISTIC_SCORE)));
        }
    }
    protected void setFacultyCharacteristics() {
        characteristics.addAll(Characteristic.getAllSkills(facultySkillNature));
    }
    public List<Characteristic> getCharacteristics() {
        return characteristics;
    }
    public SkillNature getFacultySkillNature() {
        return facultySkillNature;
    }
}
