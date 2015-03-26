package primeFactorization;

import static org.junit.Assert.*;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class PrimeNumberGeneratorTest {
	private PrimeNumberListGenerator generator;
	private Integer inputNumber;
	private List<Integer> expectedResult;

	private static List<Integer> list(Integer...integers) {
			return Arrays.asList(integers);
	}
	@Before
	public void initialize() {
		this.generator = new PrimeNumberListGenerator();
	}

	public PrimeNumberGeneratorTest(Integer inputNumber, List<Integer> expectedResult) {
		this.inputNumber = inputNumber;
		this.expectedResult = expectedResult;
	}

	@Parameterized.Parameters
	public static Collection primeNumbers() {
		return Arrays.asList(new Object[][] { 
				{ 2, list(1)},
				{ 3, list(1,2)}
		});
	}

	@Test
	public void testPrimeNumberGenerator() {
		assertEquals(expectedResult, generator.generateList(inputNumber));
	}

}
