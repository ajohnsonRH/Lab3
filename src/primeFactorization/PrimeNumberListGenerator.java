package primeFactorization;

import java.util.ArrayList;

public class PrimeNumberListGenerator {

	public ArrayList<Integer> generateList(Integer inputNumber) {
		ArrayList<Integer> primes = new ArrayList<Integer>();
		for (int i = 2; i < inputNumber; i++) {
			if (isPrime(i)) {
				primes.add(i);
			}
		}
		return primes;
	}

	static boolean isPrime(int number) {
		for (int j = 2; j < (number / 2)+1; j++) {
			if (number % j == 0) {
				return false;
			}
		}
		return true;
	}
}
