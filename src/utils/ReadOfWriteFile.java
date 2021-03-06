package utils;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class ReadOfWriteFile {
    private static final String NEW_LINE_SEPARATOR = "\n";
    public static <T> void write(String path, ArrayList<T> list) {
        try {
            FileWriter fw = new FileWriter(path);
            BufferedWriter bw = new BufferedWriter(fw);
            for (Object item : list) {
                bw.write(item.toString());
                bw.write(NEW_LINE_SEPARATOR);
            }
            bw.flush();
            fw.close();
        } catch (FileNotFoundException e) {
            throw new IllegalArgumentException(path + "Không hợp lệ!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static ArrayList<String> read(String path) {
        try {
            return (ArrayList<String>) Files.readAllLines(Paths.get(path));
        } catch (IOException e) {
            throw new IllegalArgumentException(path + "Không hợp lệ!");
        }
    }
}
