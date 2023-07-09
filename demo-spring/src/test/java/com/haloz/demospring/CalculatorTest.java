package com.haloz.demospring;

import com.haloz.demospring.exception.DividingByZeroException;
import com.haloz.demospring.service.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculatorTest {
	private Calculator calculator;
	private int num1, num2, num3;

	@BeforeEach
	public void init() {
		calculator = new Calculator();
		num1 = 10;
		num2 = 5;
		num3 = -18;
	}
	@Test
	public void getPlusResult() {
		Assertions.assertAll(
				()->Assertions.assertEquals(num1 + num2, calculator.plus(num1, num2)),
				()->Assertions.assertEquals(num1 + num3, calculator.plus(num1, num3))
				);
	}
	@Test
	public void getMinusResult() {
		Assertions.assertAll(
				()->Assertions.assertEquals(num1 - num2, calculator.minus(num1, num2)),
				()->Assertions.assertEquals(num1 - num3, calculator.minus(num1, num3))
		);
	}
	@Test
	public void getMultiplyResult() {
		Assertions.assertAll(
				()->Assertions.assertEquals(num1 * num2, calculator.multiply(num1, num2)),
				()->Assertions.assertEquals(num1 * num3, calculator.multiply(num1, num3))
		);
	}
	@Test
	public void getDivideResult() {
		Assertions.assertAll(
				()->Assertions.assertEquals(num1 / num2, calculator.divide(num1, num2)),
				()->Assertions.assertEquals(num1 / num3, calculator.divide(num1, num3))
		);
	}
	@Test
	public void getDivideException() {
		Assertions.assertThrowsExactly(DividingByZeroException.class, () -> calculator.divide(num1, 0));
	}
}
