package de.hankel.calculator.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

import de.hankel.calculator.Calculator;

/**
 * Automatisch generierte Test Cases
 * 
 * @author Lorenz Hankel
 *
 */
class CalculatorTest {

	private static Calculator calc;

	@BeforeAll
	public static void setup() {
		System.out.println("BeforeAll");
		calc = new Calculator();
	}

	@AfterAll
	public static void cleanup() {
		System.out.println("AfterAll");
	}

	@BeforeEach
	public void beforeEach() {
		System.out.println("BeforeEach");
	}

	@AfterEach
	public void afterEach() {
		System.out.println("AfterEach");
	}

	@Disabled
	@Test
	void testCalculator() {
		Calculator calc = new Calculator();
		System.out.println("Not yet implemented.");
	}

	@Disabled
	@Test
	@DisplayName("4/2=2")
	void testIntegerDivision_FourDividedBy2_ShouldReturnTwo() {
		// test<Methode>_<Bedingung>_<Erwartung>
		// Arrangement
		calc = new Calculator();
		// Act
		int actual_Result = calc.integerDivision(4, 2);
		// Assert
		assertEquals(2, actual_Result);
		System.out.println("Not yet implemented.");
	}

	// Parametrisierte Tests:
	@CsvSource({ "6,4,1", "11,5,2", "0,4,0" })
	@ParameterizedTest
	void testIntegerDivision(int dividend, int divisor, int expectedResult) {
		// Arrangement
		calc = new Calculator();
		// Act
		int actual_Result = calc.integerDivision(dividend, divisor);
		// Assert
		assertEquals(expectedResult, actual_Result);
	}

	// A2.2
	@Test
	@DisplayName("4-2=2")
	void IntegerSubtraction_subtractFourByTwo_shouldReturn2() {
		calc = new Calculator();
		assertEquals(2, calc.integerSubtraction(4, 2));
	}

	// A2.3 3 Stern Aufgabe
	@Test
	@DisplayName("5/0=ArithmeticException")
	void testIntegerDivision_WhenDividendIsDividedByZero() {
		calc = new Calculator();
		assertThrows(ArithmeticException.class, () -> {
			calc.integerDivision(5, 0);
		});
	}

	// A2.4
	@CsvFileSource(files = "csvfile.csv", delimiter = ',')
	@ParameterizedTest
	void testIntegerDivisionA2_4(int dividend, int divisor, int expectedResult) {
		// Arrangement
		calc = new Calculator();
		// Act
		int actual_Result = calc.integerDivision(dividend, divisor);
		// Assert
		assertEquals(expectedResult, actual_Result);
	}

	// A2.4
	@CsvFileSource(files = "csvfile_sub.csv", delimiter = ',')
	@ParameterizedTest
	void testIntegerSubtractionA2_4(int minuend, int subtrahend, int expectedResult) {
		// Arrangement
		Calculator calc = new Calculator();
		// Act
		int actual_Result = calc.integerSubtraction(minuend, subtrahend);
		// Assert
		assertEquals(expectedResult, actual_Result);
	}

	@Test
	@DisplayName("3+7=10")
	void testIntegerAdditionAdd3To7() {
		calc = new Calculator();
		assertEquals(10, calc.integerAddition(3, 7));
	}

}
