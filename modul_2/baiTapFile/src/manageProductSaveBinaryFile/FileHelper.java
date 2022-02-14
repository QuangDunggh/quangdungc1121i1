package manageProductSaveBinaryFile;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileHelper {
    public static void writeBinaryFile(String pathFile, Object productList) {
        File file = new File(pathFile);
        if(!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        try {
            OutputStream os = new FileOutputStream(pathFile,false);
            ObjectOutputStream oos = new ObjectOutputStream(os);
            oos.writeObject(productList);
            oos.close();
            os.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static List<Object> readBinaryFile(String pathFile) {
        List<Object> productList = new ArrayList<>();
        try {
            InputStream is = new FileInputStream(pathFile);

            ObjectInputStream ois = new ObjectInputStream(is);
            productList = (List<Object>) ois.readObject();
            ois.close();
            is.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return productList;
    }


}
