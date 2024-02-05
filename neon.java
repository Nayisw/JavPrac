import java.util.Scanner;

public class neon {
    public static void main(String[] args) {

        int n, sq, digits, sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        n = sc.nextInt();
        sc.close();
        sq = n * n;
        while (sq != 0) {
            digits = sq % 10;
            sum += digits;
            sq /= 10;
        }
        if (n == sum) {
            System.out.println(n + " is an Neon Number!");
        } else {
            System.out.println(n + " is not an Neon Number!");
        }

    }
}
