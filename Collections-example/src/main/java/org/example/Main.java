package org.example;

import org.example.exercises.Ex;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Ex.ex1() =\n" + Ex.ex1());
        System.out.println("Ex.ex2() =\n" + Ex.ex2());
        System.out.println("Ex.ex3() =\n" + Ex.ex3());
        System.out.println("Ex.ex4() =\n" + outPutEx4());
    }
    private static String outPutEx4() {
        StringBuilder stringBuilder = new StringBuilder();
        for (Integer v : Ex.ex4()) {
            stringBuilder.append(v).append("\n");
        }
        return stringBuilder.toString();
    }
}