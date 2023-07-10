package com.haloz.demospring;

import com.haloz.demospring.exception.DividingByZeroException;
import com.haloz.demospring.service.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;
import java.util.stream.Stream;

public class CalculatorParamTest {
    private Calculator calculator;
    @BeforeEach
    public void init() {
        calculator = new Calculator();
    }
    @ParameterizedTest
    @MethodSource("provideParamsForTest")
    public void getPlusResult(int num1, int num2) {
        Assertions.assertEquals(num1 + num2, calculator.plus(num1, num2));
    }
    @ParameterizedTest
    @MethodSource("provideParamsForTest")
    public void getMinusResult(int num1, int num2) {
       Assertions.assertEquals(num1 - num2, calculator.minus(num1, num2));
    }
    @ParameterizedTest
    @MethodSource("provideParamsForTest")
    public void getMultiplyResult(int num1, int num2) {
        Assertions.assertEquals(num1 * num2, calculator.multiply(num1, num2));
    }
    @ParameterizedTest
    @MethodSource("provideParamsForTest")
    public void getDivideResult(int num1, int num2) {
        Assertions.assertEquals(num1 / num2, calculator.divide(num1, num2));
    }
    @ParameterizedTest
    @ValueSource(ints = {90, 0})
    public void getDivideException(int num) {
        Assertions.assertThrowsExactly(DividingByZeroException.class, () -> calculator.divide(num, 0));
    }
    public static Stream<Arguments> provideParamsForTest() {
        return Stream.of(
                Arguments.of(10, 12),
                Arguments.of(10, -1),
                Arguments.of(0, 2),
                Arguments.of(-10, 12)
        );
    }
}
