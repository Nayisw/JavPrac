import java.util.Scanner;

public class automorphix {

    public static void main(String[] args) {
        int temp = 0, user, scan = 0, math = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        user = sc.nextInt();
        sc.close();
        temp = user;

        scan = temp % 10;
        math = scan * scan;

        if (user == math) {
            System.out.println(user + " is an Automorphic number!");

        } else {
            System.out.println(user + "is not an Automorphic number!");
        }

    }
}
