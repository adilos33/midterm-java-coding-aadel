package math.problems;

public class Pattern {

	public static void main(String[] args) {
		/* Read this numbers, find the pattern then implement the logic from this pattern.which will give you this output.
		 * 100,99,98,97,96,95,94,93,92,91,90,88,86,84,82,80,78,76,74,72,70,67,64,61,58,55,52,49,46,43,40,36,32............
		 *
		 *
		 */


		public class NumberPatternExample {
			public static void main(String[] args) {
				int startNumber = 100;
				int decreaseBy = 1;

				generatePattern(startNumber, decreaseBy);
			}

			public static void generatePattern(int startNumber, int decreaseBy) {
				int count = 0;
				int currentNumber = startNumber;

				while (currentNumber >= 0) {
					System.out.print(currentNumber + " ");

					count++;
					currentNumber -= decreaseBy;

					if (count % 10 == 0) {
						decreaseBy++;
					}
				}
			}
		}

	}
}
