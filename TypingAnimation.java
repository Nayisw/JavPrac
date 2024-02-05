import java.util.concurrent.TimeUnit;

public class TypingAnimation {

    public static void main(String[] args) {
        int[] asciiValues = { 89, 111, 117, 32, 97, 114, 101, 32, 116, 104, 101, 32, 98, 101, 115, 116, 32, 100, 105,
                100, 105, 33, 3 };

        StringBuilder textToType = new StringBuilder();
        for (int asciiValue : asciiValues) {
            char character = (char) asciiValue;
            textToType.append(character);
        }

        int typingSpeed = 100;

        int fontSize = 24;

        typeTextWithAnimation(textToType.toString(), fontSize, typingSpeed);
    }

    private static void typeTextWithAnimation(String text, int fontSize, int speed) {
        System.out.print("\033[0;1m");
        System.out.print("\033[" + fontSize + "m");

        for (char c : text.toCharArray()) {
            System.out.print(c);

            try {
                TimeUnit.MILLISECONDS.sleep(speed);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.print("\033[0m");
    }
}
