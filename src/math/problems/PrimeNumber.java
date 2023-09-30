package math.problems;

public class PrimeNumber {

	public static void main(String[] args) {
		/*
		 * Find list of Prime numbers from number 2 to 1 million.
		 * Try the best solution as possible.Which will take less CPU life cycle.
		 * Out put number of Prime numbers on the given range.
		 *
		 *
		 * Use any databases[MySql] to store data and retrieve data.
		 *
		 */

		import java.util.ArrayList;
import java.util.List;

		public class PrimeNumbersExample {
			public static void main(String[] args) {
				int upperLimit = 1000000;

				List<Integer> primeNumbers = findPrimes(upperLimit);

				System.out.println("Number of prime numbers between 2 and " + upperLimit + ": " + primeNumbers.size());
			}

			public static List<Integer> findPrimes(int n) {
				boolean[] isPrime = new boolean[n + 1];
				List<Integer> primes = new ArrayList<>();

				for (int i = 2; i <= n; i++) {
					isPrime[i] = true;
				}

				for (int i = 2; i * i <= n; i++) {
					if (isPrime[i]) {
						for (int j = i * i; j <= n; j += i) {
							isPrime[j] = false;
						}
					}
				}

				for (int i = 2; i <= n; i++) {
					if (isPrime[i]) {
						primes.add(i);
					}
				}

				return primes;
			}
		}


	}

}
