package copyText;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        CopyText copyText = new CopyText();
        List<Integer> numbers = copyText.readFile("fileText.txt");
        copyText.copyFile("fileCopy.txt", numbers);
    }
}
