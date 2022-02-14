package exceptionAndDebug;

public class TriangleEdgesCheck {
    public void checkTriangleEdges(double a, double b, double c) throws TriangleEdgesException,TriangleEdgesException1 {
        if (a + b <= c || a + c <= b || b + c <= a) {
            throw new TriangleEdgesException("Lỗi: Tam giác không hợp lệ");

        } else {
            System.out.println("Tam giác hợp lệ");
        }

    }
}
