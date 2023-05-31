package utils;

import entities.Student;
import entities.quality.Skill;
import entities.quality.SkillNature;
import lombok.NonNull;

public class CompareStudents {
    @NonNull
    public static Student compare(Student student1, Student student2) {
        if (areStudentFromSameFaculty(student1,student2)) {
            if (isStudentBetter(student1,student2,SkillNature.SOCIAL)) {
                return student1;
            }
            return student2;
        }
        if(isStudentBetter(student1,student2,SkillNature.MAGIC)){
            return student1;
        }
        return student2;
    }
    @NonNull
    private static boolean areStudentFromSameFaculty(Student student1, Student student2){
        return student1.getFaculty().equals(student2.getFaculty());
    }
    @NonNull
    private static int sumSkillsPoints(Student student, SkillNature skillNature){
        int sum = 0;
        for(Skill skill : student.getStudentSkills(skillNature)) {
            sum += skill.getScore();
        }
        return sum;
    }
    @NonNull
    private static boolean isStudentBetter(Student student, Student comparableStudent, SkillNature categoryComparable) {
        return sumSkillsPoints(student, categoryComparable) >= sumSkillsPoints(comparableStudent, categoryComparable);
    }

}
