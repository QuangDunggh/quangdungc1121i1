package createFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.List;

public class fileReader {
    public static void main(String[] args) {
//        String s = "D:\\CodeGym\\quangdungc1121i1\\modul_2\\baiTapFile\\output.text";
        File file = new File("D:\\CodeGym\\quangdungc1121i1\\modul_2\\baiTapFile\\output.text");
        try {
            List<String> allText = Files.readAllLines(file.toPath(), StandardCharsets.UTF_8);

           for(String line: allText) {
               System.out.println(line);
           }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
