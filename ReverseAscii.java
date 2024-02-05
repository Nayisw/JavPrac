import java.util.Scanner;

public class ReverseAscii {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter ASCII values separated by spaces: ");
        String input = scanner.nextLine();

        // Split input by spaces and convert to characters
        String[] asciiValues = input.split(" ");
        for (String asciiString : asciiValues) {
            try {
                int asciiValue = Integer.parseInt(asciiString);
                char character = (char) asciiValue;

                System.out.println("ASCII Value: " + asciiValue + ", Character: " + character);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input: " + asciiString + " is not a valid integer.");
            }
        }

        scanner.close();
    }
}
