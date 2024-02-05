import java.util.Scanner;

public class disarium {

    static int countDigits(int number){
        if (number == 0){
            return 0;
        }
        return 1 + countDigits(number/ 10);
    }

    static boolean isDisarium(int number, int originalNumber){
        int digitCount = countDigits(originalNumber);
        int sum= 0;

        while (number>0) {
        int digit = number % 10;
        sum += Math.pow(digit, digitCount);
        number /= 10;
        digitCount --;    
        }
        return sum == originalNumber;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any Number: ");
        int num= sc.nextInt();
        sc.close();

        if (isDisarium(num, num)){
            System.out.println(num+ " is a Disarium Number!");
        }
        else{
            System.out.println(num+" is not a Disarium Number!");
        }
    }
}
