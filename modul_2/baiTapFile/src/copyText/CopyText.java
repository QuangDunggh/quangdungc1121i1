package copyText;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CopyText {
    public List<Integer> readFile(String pathFile) {
        List<Integer> numbers = new ArrayList<>();
        try {
            File file = new File(pathFile);
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line = "";
            while ((line = br.readLine()) != null) {
                numbers.add(Integer.parseInt(line));
            }
            br.close();
        } catch (IOException e) {
            System.out.println("Find is not found or error!!!");
        }
        return numbers;
    }

    public void copyFile(String path, List<Integer> numbers) {
        try {
            File file = new File(path);
            BufferedWriter bw = new BufferedWriter(new FileWriter(file));
            for (int i = 0; i < numbers.size(); i++) {
               bw.write(numbers.get(i).toString());
               bw.newLine();

            }
            bw.flush();
            bw.close();

        } catch (IOException e) {
            System.out.println("Error!!!");
        }
    }
}
