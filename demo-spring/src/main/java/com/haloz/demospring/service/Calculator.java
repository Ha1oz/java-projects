package com.haloz.demospring.service;


import com.haloz.demospring.exception.DividingByZeroException;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Service;

@Service
public class Calculator implements CalculatorService {
    @Override
    public String welcome() {
        return "Hello. I'm a Calculator!";
    }
    @Override
    @NonNull
    public Integer plus(Integer val1, Integer val2) {
        return val1 + val2;
    }
    @Override
    @NonNull
    public Integer minus(Integer val1, Integer val2) {
        return val1 - val2;
    }
    @Override
    @NonNull
    public Integer multiply(Integer val1, Integer val2) {
        return val1 * val2;
    }
    @Override
    @NonNull
    public Integer divide(Integer val1, Integer val2) {
        if (val2 == 0) {
            throw new DividingByZeroException("The second value cannot be zero");
        }
        return val1 / val2;
    }


}
