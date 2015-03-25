package primeFactorization;

import java.util.ArrayList;

public class PrimeFactorization {

	public static ArrayList<Integer> generate(int i) {
		ArrayList<Integer> primes = new ArrayList<Integer>();
		if(i % 2 ==0 ){
			primes.add(2);
			i=i/2;
		}
		if(i> 1){
			primes.add(i);
		}
		return primes;
	}
}
