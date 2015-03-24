package primeFactorization;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class PrimeFactorizationTest {
	private ArrayList<Integer> List() {

		return new ArrayList<Integer>();
	}
	@Test
	public void testOne() {
		assertEquals(List(), PrimeFactorization.generate());
	}

	

}
