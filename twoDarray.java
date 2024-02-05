import java.util.*;

public class twoDarray {

    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the number of rows: ");
            int rows = sc.nextInt();
            System.out.println("Enter the number of columns: ");
            int cols = sc.nextInt();

            int a[][] = new int[rows][cols];

            System.out.println("Enter"+(rows*cols)+" elements:");
            for(int i = 0; i < rows; i++){
                for(int j = 0; j < cols; j++){

                    a[i][j] = sc.nextInt();
                }
            }
            for(int i = 0; i < rows; i++){
                for(int j = 0; j < cols; j++){

                    System.out.print(+a[i][j]);
                }
                System.out.println();
            }
        }
    }    
}