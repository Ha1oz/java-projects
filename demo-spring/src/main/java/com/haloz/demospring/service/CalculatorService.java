package com.haloz.demospring.service;

public interface CalculatorService {
    String welcome();
    Integer plus(Integer val1, Integer val2);
    Integer minus(Integer val1, Integer val2);
    Integer multiply(Integer val1, Integer val2);
    Integer divide(Integer val1, Integer val2);
}
