import java.util.Scanner;

public class facinatingnumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to check if it's a fascinating number: ");
        int num = scanner.nextInt();

        if (isFascinatingNumber(num)) {
            System.out.println(num + " is a fascinating number.");
        } else {
            System.out.println(num + " is not a fascinating number.");
        }
        scanner.close();
    }

    public static boolean isFascinatingNumber(int num) {
        String concatenatedNum = String.valueOf(num) + String.valueOf(num * 2) + String.valueOf(num * 3);

        boolean[] digitFrequency = new boolean[10]; 

        for (char c : concatenatedNum.toCharArray()) {
            if (c == '0') {
                return false; 
            }
            int digit = c - '0'; 
            if (digitFrequency[digit]) {
                return false; 
            }
            digitFrequency[digit] = true;
        }
        return true;
    }
}
