package findMaxValueInFile;

import jdk.nashorn.internal.ir.WhileNode;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteFile {
    public List<Integer> readFile(String filePath) {
        List<Integer> numbers = new ArrayList<>();
        try {
            File file = new File(filePath);
            if(!file.exists()) {
                throw new FileNotFoundException();
            }
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line = "";
            while ((line = br.readLine()) != null) {
                numbers.add(Integer.parseInt(line));
            }
            br.close();
        } catch (IOException e) {
            System.out.println("File is not found or error");
        }
        return numbers;
    }
    public void writeFile(String filePath, int max) {
        try {
            FileWriter writer = new FileWriter(filePath,false);
            BufferedWriter bw = new BufferedWriter(writer);
            bw.write("\nGiá trị lớn nhất là " + max + ", ");

            bw.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
