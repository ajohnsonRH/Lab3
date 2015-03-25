package primeFactorization;

import java.util.ArrayList;

public class PrimeFactorization {

	public static ArrayList<Integer> generate(int i) {
		ArrayList<Integer> primes = new ArrayList<Integer>();
		for(; i % 2 == 0;i/=2) {
			primes.add(2);
		}
		if (i > 1) {
			primes.add(i);
		}
		return primes;
	}
}
