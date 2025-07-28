import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Rd6withoutscanner {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the word:");
        String input = reader.readLine(); // reading input

        // Reverse the string using StringBuffer
        String reversed = new StringBuffer(input).reverse().toString();
        System.out.println("Reversed: " + reversed);

        // Check for palindrome
        if (input.equals(reversed)) {
            System.out.println("Entered word is palindrome");
        } else {
            System.out.println("It is not palindrome");
        }
    }
}
