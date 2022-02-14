package binaryFile;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.Scanner;

public class Main {
    private static void copyFileUsingJava7File(File source, File dest) throws IOException {
        Files.copy(source.toPath(), dest.toPath(), StandardCopyOption.REPLACE_EXISTING);
    }

    private static void copyFileUsingStream(File source, File dest) throws IOException {
        InputStream is = null;
        OutputStream os = null;
        try {
            is = new FileInputStream(source);
            os = new FileOutputStream(dest);
            byte[] bytes = new byte[1024];
            int length;
            while ((length = is.read(bytes)) > 0) {
                os.write(bytes, 0, length);
            }
        } finally {
            is.close();
            os.close();
        }

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter source file: ");
        String sourcePath = input.nextLine();
        System.out.print("Enter destination file: ");
        String destPath = input.nextLine();
        File sourceFile = new File(sourcePath);
        File destFile = new File(destPath);
        try {
            copyFileUsingJava7File(sourceFile,destFile);
            copyFileUsingStream(sourceFile,destFile);
            System.out.println("Copy complete");
        } catch (IOException o) {
            System.out.print("Can't copy that file");
            System.out.println(o.getMessage());
        }
    }
}
