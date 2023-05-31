import entities.HogwartsFaculty;
import entities.Student;
import entities.faculty.*;
import entities.quality.Characteristic;
import entities.quality.Skill;
import utils.CompareStudents;

public class Main {
    public static void main(String[] args) {

        Student student1 = new Student("Oleg",
                new Skill(Characteristic.POWER, 10),
                new Skill(Characteristic.TRANSGRESSION, 20));
        Student student2 = new Student("Alex",
                new Skill(Characteristic.POWER, 90),
                new Skill(Characteristic.TRANSGRESSION, 80));
        Student student3 = new Student("Solod",
                new Skill(Characteristic.POWER, 100),
                new Skill(Characteristic.TRANSGRESSION, 200));


        HogwartsFaculty gryffindor = new Gryffindor();
        HogwartsFaculty hufflepuff = new Hufflepuff();
        HogwartsFaculty ravenclaw = new Ravenclaw();
        HogwartsFaculty slytherin = new Slytherin();

        gryffindor.addStudent(student1);
        gryffindor.addStudent(student2);
        hufflepuff.addStudent(student3);

        outputBestStudentOfTwo(student1,student2);
        outputBestStudentOfTwo(student1,student3);
    }
    private static void outputBestStudentOfTwo(Student student1, Student student2) {
        System.out.printf("If compare who is the better student of the two (%s or %s), the best would be: %s\n",
                student1.getFullName(), student2.getFullName(), CompareStudents.compare(student1,student2).getFullName());
        System.out.println(student1);
        System.out.println(student2);
        System.out.println();
    }
}
