package entities;

import entities.quality.Characteristic;
import entities.quality.Magic;
import entities.quality.Points;

import java.util.HashSet;
import java.util.Set;

public class Student {
    String fullName;
    Set<Points<Characteristic>> characteristicPoints = new HashSet<>();;
    Set<Points<Magic>> magicPoints = new HashSet<>();;
    public Student(String fullName) {
        this.fullName = fullName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "fullName='" + fullName + '\'' +
                ", characteristicPoints=" + characteristicPoints +
                ", magicPoints=" + magicPoints +
                '}';
    }
}
