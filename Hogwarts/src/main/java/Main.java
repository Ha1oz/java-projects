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
                new Skill(Characteristic.TRANSGRESSION, 20),
                new Skill(Characteristic.AUTHORITY, 10),
                new Skill(Characteristic.WIT, 20));
        Student student2 = new Student("Alex",
                new Skill(Characteristic.POWER, 90),
                new Skill(Characteristic.TRANSGRESSION, 80),
                new Skill(Characteristic.AUTHORITY, 13),
                new Skill(Characteristic.WIT, 30));
        Student student3 = new Student("Solod",
                new Skill(Characteristic.POWER, 100),
                new Skill(Characteristic.TRANSGRESSION, 200),
                new Skill(Characteristic.AUTHORITY, 10),
                new Skill(Characteristic.WIT, 20));
        System.out.println("newStudent = " + student1);

        HogwartsFaculty gryffindor = new Gryffindor();
        HogwartsFaculty hufflepuff = new Hufflepuff();
        HogwartsFaculty ravenclaw = new Ravenclaw();
        HogwartsFaculty slytherin = new Slytherin();

        gryffindor.addStudent(student1);
        gryffindor.addStudent(student2);
        hufflepuff.addStudent(student3);

        System.out.println("Compare 1: Student is better:" + CompareStudents.compare(student1,student2));
        System.out.println("Compare 2: Student is better:" + CompareStudents.compare(student1,student3));
    }
}
