package excercise;

import java.io.*;

public class CreatFileExample {
    public static void main(String[] args) {
        try {
            PrintWriter pw = new PrintWriter("fileText.txt", "UTF-8");
            pw.println(1);
            pw.println(2);
            pw.println(4);
            pw.println(5);
            pw.println(7);
            pw.println(9);
            pw.println(15);
            pw.flush();
            pw.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }
}
