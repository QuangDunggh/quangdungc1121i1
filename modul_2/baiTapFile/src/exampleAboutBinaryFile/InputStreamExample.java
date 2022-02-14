package exampleAboutBinaryFile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class InputStreamExample {
    public static void main(String[] args) throws IOException {
        InputStream inputStream = new FileInputStream("output.text");
        int i = -1;
        while ((i = inputStream.read()) != -1) {
            System.out.println((char) i);
        }
        inputStream.close();
    }
}
