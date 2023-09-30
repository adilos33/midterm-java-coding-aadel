package string.problems;

public class Permutation {

    public static void main(String[] args) {
        /*
         * Permutation of String "ABC" is "ABC" "BAC" "BCA" "ACB" "CAB" "CBA".
         * Write Java program to compute all Permutation of a String
         *
         */

        public class StringPermutations {

            public static void generatePermutations(String str) {
                generatePermutationsHelper("", str);
            }

            private static void generatePermutationsHelper(String prefix, String remaining) {
                int n = remaining.length();
                if (n == 0) {
                    System.out.println(prefix);  // Found a permutation
                } else {
                    for (int i = 0; i < n; i++) {
                        String newPrefix = prefix + remaining.charAt(i);
                        String newRemaining = remaining.substring(0, i) + remaining.substring(i + 1);
                        generatePermutationsHelper(newPrefix, newRemaining);
                    }
                }
            }

            public static void main(String[] args) {
                String input = "ABC";
                System.out.println("Permutations of \"" + input + "\":");
                generatePermutations(input);
            }
        }

    }
}
