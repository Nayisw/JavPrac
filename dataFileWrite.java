import java.io.*;
/**
 * dataFileWrite
 */
public class dataFileWrite {

    public static void main(String[] args) throws IOException{
        FileOutputStream fos = new FileOutputStream("names.dat");
        DataOutputStream dos = new DataOutputStream(fos);

        dos.writeUTF("Pranay");
        dos.writeInt(1);;
        dos.close();
    }
}