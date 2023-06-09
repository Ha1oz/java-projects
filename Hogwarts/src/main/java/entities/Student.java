package entities;

import entities.quality.Skill;
import entities.quality.SkillNature;
import lombok.NonNull;

import java.util.*;

public class Student {
    private final String fullName;
    private List<Skill> studentSkills = new ArrayList<>();
    private HogwartsFaculty faculty;
    @NonNull
    public Student(String fullName, Skill... skills) {
        this.fullName = fullName;
        studentSkills.addAll(Arrays.asList(skills));
    }

    public Student(String fullName) {
        this.fullName = fullName;
    }

    public String getFullName() {
        return fullName;
    }
    public List<Skill> getStudentSkills() {
        return studentSkills;
    }
    @NonNull
    public List<Skill> getStudentSkills(SkillNature skillNature) {
        return studentSkills
                .stream()
                .filter(c -> c.getCharacteristic().getSkillNature().equals(skillNature))
                .toList();
    }
    @NonNull
    public void addSkills(Skill... skills){
        for(Skill skill : skills) {
            if (studentSkills.contains(skill)) {
                continue;
            }
            studentSkills.add(skill);
        }
    }
    public HogwartsFaculty getFaculty() {
        return faculty;
    }
    @NonNull
    public void setFaculty(HogwartsFaculty faculty) {
        this.faculty = faculty;
        faculty.addStudent(this);
    }

    @Override
    public String toString() {
        return  fullName +
                ", " + studentSkills +
                ", " + faculty +
                '}';
    }
}
