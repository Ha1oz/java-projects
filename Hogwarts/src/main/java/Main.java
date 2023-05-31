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
                new Skill(Characteristic.POWER, 0),
                new Skill(Characteristic.TRANSGRESSION, 0));

        System.out.println();
        System.out.println("student1 = " + student1);
        System.out.println("student2 = " + student2);
        System.out.println("student3 = " + student3);
        System.out.println();

        HogwartsFaculty gryffindor = new Gryffindor();
        HogwartsFaculty hufflepuff = new Hufflepuff();
        HogwartsFaculty ravenclaw = new Ravenclaw();
        HogwartsFaculty slytherin = new Slytherin();

        gryffindor.addStudent(student1);
        gryffindor.addStudent(student2);
        slytherin.addStudent(student3);

        System.out.println();
        System.out.println("student1 = " + student1);
        System.out.println("student2 = " + student2);
        System.out.println("student3 = " + student3);
        System.out.println();

        outputBestStudentOfTwo(student1,student2);
        outputBestStudentOfTwo(student1,student3);
    }
    private static void outputBestStudentOfTwo(Student student1, Student student2) {
        System.out.printf("If compare who is the better student of this two (%s or %s), the best would be: %s\n",
                student1.getFullName(), student2.getFullName(), CompareStudents.compare(student1,student2).getFullName());
        System.out.println(student1);
        System.out.println(student2);
        System.out.println();
    }
}
