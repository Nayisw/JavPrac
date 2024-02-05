import java.io.*;

/**
 * dataFileRead
 */
public class dataFileRead {

    public static void main(String[] args) throws IOException{
        FileInputStream fis = new FileInputStream("names.dat");
        DataInputStream dis = new DataInputStream(fis);

        boolean eof = false;

        while (!eof) {
            try {
                String n = dis.readUTF();
                int x = dis.readInt();
                System.out.println("Name: "+n);
                System.out.println("Roll No.: "+x);
            } catch (EOFException e) {
                eof = true;
            }
            
        }
        dis.close();
    }
}