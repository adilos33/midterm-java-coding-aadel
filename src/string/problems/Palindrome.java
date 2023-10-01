package string.problems;

public class Palindrome {
    public static void main(String[] args) {
        /*
          If a String is reversed and it remains unchanged, that is called Palindrome. For example, MOM,DAD,MADAM are
          Palindrome. So write java code to check if a given String is Palindrome or not.
         */

        public class PalindromeCheck {

            public static boolean isPalindrome(String str) {
                // Remove spaces and convert to lowercase for case-insensitive comparison
                str = str.replaceAll("\\s", "").toLowerCase();

                int left = 0;
                int right = str.length() - 1;

                while (left < right) {
                    if (str.charAt(left) != str.charAt(right)) {
                        return false; // Characters at the corresponding positions don't match
                    }
                    left++;
                    right--;
                }

                return true;
            }

            public static void main(String[] args) {
                String str1 = "MOM";
                String str2 = "DAD";
                String str3 = "MADAM";
                String str4 = "Hello";

                System.out.println(str1 + " is a palindrome: " + isPalindrome(str1));
                System.out.println(str2 + " is a palindrome: " + isPalindrome(str2));
                System.out.println(str3 + " is a palindrome: " + isPalindrome(str3));
                System.out.println(str4 + " is a palindrome: " + isPalindrome(str4));
            }
        }


    }
}
public class Factorial {
    public static int calculateFactorial(int n) {
        // Input validation: Check if n is negative
        if (n < 0) {
            throw new IllegalArgumentException("Input should be a non-negative integer");
        }

        int result = 1;

        // Calculate the factorial
        for (int i = 1; i <= n; i++) {
            result *= i;
        }

        return result;
    }
}
