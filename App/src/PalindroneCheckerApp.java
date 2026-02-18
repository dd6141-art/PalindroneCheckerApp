/**
 * ==========================================================
 * MAIN CLASS - UseCase2PalindromeCheckerApp
 * ==========================================================
 * * Description:
 * This class demonstrates basic palindrome validation
 * using a hardcoded string value.
 * * At this stage, the application:
 * - Stores a predefined string
 * - Compares characters from both ends
 * - Determines whether the string is a palindrome
 * - Displays the result on the console
 * * @author Developer
 * @version 2.0
 */
public class PalindroneCheckerApp {

    /**
     * Application entry point for UC2.
     * @param args Command-line arguments
     */
    public static void main(String[] args) {
        // Step 1: Hardcoded string to check
        String input = "madam";
        boolean isPalindrome = true;
        int length = input.length();

        // Step 2: Loop only till half of the string length (as per hint)
        for (int i = 0; i < length / 2; i++) {
            // Compare character at index i with character at the mirrored index from the end
            if (input.charAt(i) != input.charAt(length - 1 - i)) {
                isPalindrome = false;
                break; // No need to check further if a mismatch is found
            }
        }

        // Step 3: Conditional statement to print the result
        if (isPalindrome) {
            System.out.println("The string \"" + input + "\" is a palindrome.");
        } else {
            System.out.println("The string \"" + input + "\" is not a palindrome.");
        }
    }
}
