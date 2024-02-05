public class ExtractAscii {

    public static void main(String[] args) {
        String inputString = "You are the best didi!";

        // Extract ASCII values using a for loop
        for (int i = 0; i < inputString.length(); i++) {
            char currentChar = inputString.charAt(i);
            int asciiValue = (int) currentChar;

            System.out.print(" " + asciiValue);
        }
    }
}
