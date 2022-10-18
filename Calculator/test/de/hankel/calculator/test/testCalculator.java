package de.hankel.calculator.test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import de.hankel.calculator.Calculator;

class testCalculator {

	@Test
	@DisplayName("4/2=2")
	void IntegerDivision_divide4_by_2_shouldReturn2() {
		Calculator calc = new Calculator();
		assertEquals(2, calc.integerDivision(4, 2));
	}

	@Test
	@DisplayName("4-2=2")
	void IntegerSubtraction_subtract4_by_2_shouldReturn2() {
		Calculator calc = new Calculator();
		assertEquals(2, calc.integerSubtraction(4, 2));
	}

	@Test
	@DisplayName("5/0=ArithmeticException")
	void testIntegerDivision_WhenDividendIsDividedByZero() {
		Calculator calc = new Calculator();
		assertThrows(ArithmeticException.class, () -> {
			calc.integerDivision(5, 0);
		});
	}
	
	@Test
	@DisplayName("5+5=10")
	void IntegerAddition_add5_to_5_shouldReturn10() {
		Calculator calc = new Calculator();
		assertEquals(10, calc.integerAddition(5, 5));
	}
}
