import java.io.*;
import java.util.*;
/**
 * dataFileReadWithMethods
 */
public class dataFileReadWithMethods {

    public static void findpro(String str) throws IOException{

        FileInputStream fis = new FileInputStream("names.dat");
        DataInputStream dis = new DataInputStream(fis);

        boolean eof = false;
        

        while (!eof) {
            try {
                String s = dis.readUTF();
                int n = dis.readInt();
                if (str.equals(s)){
                    System.out.println("Name found!");
                    System.out.println("Roll no.: "+ n);

                }
                else{
                    System.out.println("Name not found!");
                }                
            } catch (EOFException e) {
               eof = true;
            }
            
        }
        dis.close();
        fis.close();
    }
    public static void main(String[] args) throws IOException {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a name to find: ");
        String name= sc.nextLine();
        findpro(name);
        sc.close();
    }
}