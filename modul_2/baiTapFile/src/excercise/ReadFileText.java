package excercise;

import java.io.*;

public class ReadFileText {
    public void readFileText(String path) {
        try {
            File file = new File(path);
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line = "";
            int sum = 0;
            while ((line = br.readLine()) != null) {
                System.out.print(line + " ");
                sum += Integer.parseInt(line);
            }
            br.close();
            System.out.println("Tổng: " + sum);
        } catch (FileNotFoundException e) {
            System.out.println("File không tồn tại hoặc nội dung bị lỗi!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
