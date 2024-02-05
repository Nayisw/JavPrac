import java.io.*;

/**
 * filewriter
 */
public class filewriter {

    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("fruits.txt");
        BufferedWriter bw = new BufferedWriter(fw);
        PrintWriter pw = new PrintWriter(bw);

        pw.println("Mango");
        pw.println("Gugugaagaa");
        pw.println("Lorem");
        pw.close();
    }
}