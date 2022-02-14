package exampleAboutBinaryFile;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class InputExample2 {
    public static void main(String[] args) {
        try {
            InputStream is = new FileInputStream("output.text");
            int i = -1;
            byte [] bytes = new byte[64];
            while ((i = is.read(bytes)) != -1) {
                String st = new String(bytes,0,i);
                System.out.println(st);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
