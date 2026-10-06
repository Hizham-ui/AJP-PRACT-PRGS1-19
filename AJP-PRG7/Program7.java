import java.util.Scanner;
import java.util.TreeSet;

public class TokenizeAndSort {

    public static void main(String[] args) {

        // Get the input from the user
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a line of text:");
        String inputText = scanner.nextLine();

        // Tokenize the input text into individual words
        String[] tokens = inputText.split("\\s+");

        // TreeSet automatically stores elements in ascending order
        TreeSet<String> tokenSet = new TreeSet<>();

        for (int i = 0; i < tokens.length; i++) {
            tokenSet.add(tokens[i]);
        }

        // Print the tokens in ascending sorted order
        System.out.println("Tokens in ascending sorted order:");

        for (String token : tokenSet) {
            System.out.println(token);
        }

        scanner.close();
    }
}

