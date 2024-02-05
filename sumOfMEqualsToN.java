import java.util.Scanner;

public class sumOfMEqualsToN {

    public static void main(String[] args) {
        int m, n;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the value of M: ");
            m = sc.nextInt();
            if (100 <= m && m <= 10000) {
                System.out.println("Enter the value of N: ");
                n = sc.nextInt();
                if (n <= 100) {
                    int temp = m;

                    while (true) {
                        int sum = 0;
                        String strM = Integer.toString(temp);

                        for (int i = 0; i < strM.length(); i++) {
                            sum += strM.charAt(i) - '0';
                        }

                        if (sum == n) {
                            System.out.println("Number is: " + temp);
                            break; 
                        } else {
                            temp++; 
                        }
                    }
                } else {
                    System.out.println("Invalid. N must be less than or equal to 100");
                }
            } else {
                System.out.println("Invalid. M must be greater than equal to 100 or less than equal to 10000!");
            }
        }
    }
}
