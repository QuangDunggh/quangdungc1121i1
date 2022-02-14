package exceptionAndDebug;

import java.util.Scanner;

public class CheckTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TriangleEdgesCheck triangleEdgesCheck = new TriangleEdgesCheck();
        try {
            System.out.print("Nhập cạnh a của tam giác: ");
            double a = Double.parseDouble(scanner.nextLine());
            System.out.print("Nhập cạnh b của tam giác: ");
            double b = Double.parseDouble(scanner.nextLine());
            System.out.print("Nhập cạnh c của tam giác: ");
            double c = Double.parseDouble(scanner.nextLine());
//            try {
                triangleEdgesCheck.checkTriangleEdges(a,b,c);
//            } catch (TriangleEdgesException e) {
//                System.out.println(e.getMessage());
//            }
        } catch (Exception ex) {
            System.out.println("Không đúng định dạng");
        }
        finally {
            System.out.println("Done");
        }


    }
}
