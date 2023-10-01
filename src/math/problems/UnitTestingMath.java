package math.problems;

public class UnitTestingMath {
    public static void main(String[] args) {
        //Apply Unit testing into each classes and methods in this package.


        import org.junit.Test;
import static org.junit.Assert.assertEquals;

        public class FactorialTest {

            @Test
            public void testCalculateFactorial()
            int input = 5;
                int expectedOutput = 120;


                int result = Factorial.calculateFactorial(input);

                assertEquals(expectedOutput, result);
            }
        }

    }
}
