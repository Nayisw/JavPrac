import java.util.Scanner;
import java.io.*;

public class matrixInFile {
    
    public static void main(String[] args) throws IOException{

        try (Scanner sc = new Scanner(System.in)) {
            FileWriter fw = new FileWriter("matrix.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);

            System.out.println("Enter the number of rows:");
            int row = sc.nextInt();

            System.out.println("Enter the number of columns:");
            int col = sc.nextInt();

            int a[][] = new int[row][col];
            System.out.println("Enter "+(row*col)+" elements:");

            for(int i= 0; i<row; i++){
                for(int j = 0; j< col; j ++){
                    a[i][j] = sc.nextInt();
                }
            }

            for(int i = 0; i < row; i++){
                for(int j = 0; j < col; j++){
                   pw.print(" "+a[i][j]);
                }
                pw.println(" ");
            }
            pw.close();
        }
        FileReader fr = new FileReader("matrix.txt");
        BufferedReader br = new BufferedReader(fr);

        String n;
        
        while ((n=br.readLine())!=null) {

            System.out.println(n);
        }
        br.close();



        System.out.println("Everything worked perfectly!");

    }

    
}
