package primeFactorization;

import static org.junit.Assert.*;
import static primeFactorization.PrimeFactorization.generate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class PrimeFactorizationTest {
	private List<Integer> list(Integer...integers) {
			return Arrays.asList(integers);
	}

	@Test
	public void testOne() {
		assertEquals(list(), generate(1));
	}

	@Test
	public void testTwo() {
		assertEquals(list(2), generate(2));
	}

	@Test
	public void testThree() {
		assertEquals(list(3), generate(3));
	}
	@Test
	public void testFour() {
		assertEquals(list(2,2), generate(4));
	}
}
