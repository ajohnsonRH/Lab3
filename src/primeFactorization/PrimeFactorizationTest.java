package primeFactorization;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class PrimeFactorizationTest {
	private ArrayList List() {

		return new ArrayList();
	}
	@Test
	public void testOne() {
		assertEquals(List(), PrimeFactorization.generate());
	}

	

}
