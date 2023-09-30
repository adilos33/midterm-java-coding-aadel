package string.problems;

public class Anagram {

    public static void main(String[] args) {
        //Write a Java Program to check if the two String are Anagram. Two String are called Anagram when there is

        //same character but in different order.For example,"CAT" and "ACT", "ARMY" and "MARY".

    import java.util.Arrays;

        public class AnagramCheck {

            public static boolean areAnagrams(String str1, String str2) {
                // Remove spaces and convert to lowercase for case-insensitive comparison
                str1 = str1.replaceAll("\\s", "").toLowerCase();
                str2 = str2.replaceAll("\\s", "").toLowerCase();

                // Check if the lengths are the same
                if (str1.length() != str2.length()) {
                    return false;
                }

                // Convert strings to char arrays and sort them
                char[] charArray1 = str1.toCharArray();
                char[] charArray2 = str2.toCharArray();

                Arrays.sort(charArray1);
                Arrays.sort(charArray2);

                // Compare the sorted char arrays
                return Arrays.equals(charArray1, charArray2);
            }

            public static void main(String[] args) {
                String str1 = "CAT";
                String str2 = "ACT";

                if (areAnagrams(str1, str2)) {
                    System.out.println(str1 + " and " + str2 + " are anagrams.");
                } else {
                    System.out.println(str1 + " and " + str2 + " are not anagrams.");
                }
            }
        }


    }
}
