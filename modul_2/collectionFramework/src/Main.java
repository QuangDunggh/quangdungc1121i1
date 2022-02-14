public class Main {
    public static void main(String[] args) {
        try {
           System.exit(0);
        } catch (Exception e) {
            return;
        } finally {
            System.out.println("Done");
        }
    }
}
