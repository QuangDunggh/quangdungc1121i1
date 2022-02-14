package createFile;

import java.io.FileWriter;
import java.io.IOException;

public class CreateFile {
    public static void main(String[] args) {
        String str = " File Handing in Java using " + "FileWrite and FileReader";
        try {
            FileWriter fileWriter = new FileWriter("output.text");
            for (int i = 0; i < str.length(); i++) {
                fileWriter.write(str.charAt(i));
                fileWriter.flush();
            }
            System.out.println("Writing successful!");
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
