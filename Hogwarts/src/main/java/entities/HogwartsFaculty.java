package entities;

import entities.quality.Characteristic;
import entities.Student;
import entities.quality.SkillNature;
import lombok.NonNull;

import java.util.*;

public class HogwartsFaculty {
    protected String name = "Hogwarts";
    protected final List<Student> students = new ArrayList<>();
    protected final List<Characteristic> characteristics = new ArrayList<>();
    public HogwartsFaculty() {
        setFacultyCharacteristics();
    }
    @NonNull
    public void addStudent(Student student) {
        students.add(student);
        student.setFaculty(this);
    }
    protected void setFacultyCharacteristics() {
        characteristics.addAll(Characteristic.getAllSkills(SkillNature.SOCIAL));
    }
    public List<Characteristic> getCharacteristics() {
        return characteristics;
    }
}
