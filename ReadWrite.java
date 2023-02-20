import java.io.*;
import java.io.IOException;

public class ReadWrite {
    public static void main(String args[]) {
        try {
            FileReader fr = new FileReader("input.txt");
            FileWriter fw = new FileWriter("output.txt");
            String str = "";
            int i;

            while ((i = fr.read()) != -1) {
                str += (char) i;
            }
            System.out.println(str);
            fw.write(str);
            fr.close();
            fw.close();
            System.out.println("File Reading Writing Done ");

        } catch (IOException e) {
            System.out.println("IO EXCEPTION");
        }
    }
}
