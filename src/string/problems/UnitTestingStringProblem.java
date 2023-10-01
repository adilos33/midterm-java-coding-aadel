package string.problems;

public class UnitTestingStringProblem {
    public static void main(String[] args) {
        //Apply Unit Test into all the methods in this package.



        import org.junit.Test;
import static org.junit.Assert.*;

        public class FactorialTest {

            @Test
            public void testCalculateFactorialWithPositiveNumber() {
                // Arrange
                int input = 5;
                int expectedOutput = 120;

                // Act
                int result = Factorial.calculateFactorial(input);

                // Assert
                assertEquals(expectedOutput, result);
            }

            @Test
            public void testCalculateFactorialWithZero() {
                // Arrange
                int input = 0;
                int expectedOutput = 1;

                // Act
                int result = Factorial.calculateFactorial(input);

                // Assert
                assertEquals(expectedOutput, result);
            }

            @Test(expected = IllegalArgumentException.class)
            public void testCalculateFactorialWithNegativeNumber() {
                // Arrange
                int input = -5;

                // Act
                Factorial.calculateFactorial(input); // This should throw an IllegalArgumentException
            }
        }

    }
}
