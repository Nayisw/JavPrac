import java.io.*;

/**
 * filereader
 */
public class filereader {

    public static void main(String[] args) throws IOException{
        FileReader fr = new FileReader("fruits.txt");
        BufferedReader br = new BufferedReader(fr);

        String n;
        while ((n=br.readLine())!= null) {
            System.out.println(n);
            
        }
        br.close();
    }
}