package primeFactorization;

import static org.junit.Assert.*;

import java.awt.List;
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
	private List expectedResult;

	@Before
	public void initialize() {
		this.generator = new PrimeNumberListGenerator();
	}

	public PrimeNumberGeneratorTest(Integer inputNumber, List expectedResult) {
		this.inputNumber = inputNumber;
		this.expectedResult = expectedResult;
	}

	@Parameterized.Parameters
	public static Collection primeNumbers(){
		return Arrays.asList(new Object[][]{
				{2,new List(2)}
				
		});	
	}
	@Test
	public void testPrimeNumberGenerator(){
		assertEquals(expectedResult, generator.generateList(inputNumber));
	}
	
}
