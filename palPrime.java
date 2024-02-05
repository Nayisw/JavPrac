import java.util.Scanner;

public class palPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check:");
        int num = sc.nextInt();

        if (isPrime(num)) {
            System.out.println("Prime Number!");
            checkPalindrome(num);
        } else {
            System.out.println("Not a Prime Number");
            checkPalindrome(num);
        }
    }

    static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int k = 2; k <= num / 2; k++) {
            if (num % k == 0) {
                return false; // Not a prime number
            }
        }
        return true; // Prime number
    }

    static void checkPalindrome(int num) {
        int reverse = 0, original = num, remainder;

        while (num > 0) {
            remainder = num % 10;
            reverse = reverse * 10 + remainder;
            num /= 10;
        }

        if (original == reverse) {
            System.out.println("Palindrome number");
        } else {
            System.out.println("Not a palindrome");
        }
    }
}
