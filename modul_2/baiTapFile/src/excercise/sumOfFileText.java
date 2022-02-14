package excercise;

import java.util.Scanner;

public class sumOfFileText {
    public static void main(String[] args) {
        System.out.print("Nhập đường dẫn file: ");
        Scanner scanner = new Scanner(System.in);
        String path = scanner.nextLine();
        ReadFileText readFileText = new ReadFileText();
        readFileText.readFileText(path);
    }
}
