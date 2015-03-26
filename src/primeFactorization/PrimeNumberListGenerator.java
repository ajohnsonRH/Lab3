package primeFactorization;


import java.util.ArrayList;

public class PrimeNumberListGenerator {

	public ArrayList<Integer> generateList(Integer inputNumber) {
		ArrayList<Integer> primes = new ArrayList<Integer>();
	
		for(int i=1;i<inputNumber;i++){
			primes.add(i);
		}
		return primes;
	}

}
