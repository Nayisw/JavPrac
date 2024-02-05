import java.util.Scanner;
public class evilNumber {
    
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a Number to check: ");
            int N = sc.nextInt();
            String bistrN = Integer.toBinaryString(N);
            System.out.println("Binary of the number: " + bistrN);
            System.out.println("Checking if it's Evil Number or not...");
            int lnN = bistrN.length();
            int calc= lnN%2;
            if (calc == 0) {
                System.out.println("Evil Number !");
            }
            else{
                System.out.println("Not an Evil Number");
            }
        }
    }
}
