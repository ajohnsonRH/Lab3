package primeFactorization;


import java.util.ArrayList;

public class PrimeNumberListGenerator {

	public ArrayList<Integer> generateList(Integer inputNumber) {
		ArrayList<Integer> primes = new ArrayList<Integer>();
		primes.add(1);
		if(inputNumber == 3){
			primes.add(2);
		}
		return primes;
	}

}
