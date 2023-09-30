package math.problems;

public class FindLowestDifference {
    public static void main(String[] args) {
        /*
         Implement in java.
         Read this below two array. Find the lowest difference between the two array cell.
         The lowest difference between cells is 1
        */
        int [] array1 = {30,12,5,9,2,20,33,1};
        int [] array2 = {18,25,41,47,17,36,14,19};


import java.util.Arrays;

        public class LowestDifferenceExample {
            public static void main(String[] args) {
                int[] array1 = {30, 12, 5, 9, 2, 20, 33, 1};
                int[] array2 = {18, 25, 41, 47, 17, 36, 14, 19};

                int lowestDifference = findLowestDifference(array1, array2);

                System.out.println("The lowest difference between cells is: " + lowestDifference);
            }

            public static int findLowestDifference(int[] array1, int[] array2) {
                // Sort both arrays
                Arrays.sort(array1);
                Arrays.sort(array2);

                int i = 0; // Index for array1
                int j = 0; // Index for array2
                int lowestDifference = Integer.MAX_VALUE;

                while (i < array1.length && j < array2.length) {
                    int difference = Math.abs(array1[i] - array2[j]);

                    if (difference < lowestDifference) {
                        lowestDifference = difference;
                    }

                    if (array1[i] < array2[j]) {
                        i++;
                    } else {
                        j++;
                    }
                }

                return lowestDifference;
            }
        }


    }

}


////First 40 Fibonacci numbers:
//0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040, 1346269, 2178309, 3524578, 5702887, 9227465, 14930352, 24157817, 39088169, 63245986, 102334155