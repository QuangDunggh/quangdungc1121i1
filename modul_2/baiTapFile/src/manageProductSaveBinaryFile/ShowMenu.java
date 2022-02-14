package manageProductSaveBinaryFile;

import com.oracle.xmlns.internal.webservices.jaxws_databinding.SoapBindingParameterStyle;

import java.util.Scanner;

public class ShowMenu {
    ServiceProduct serviceProduct = new ServiceProduct();
    static Scanner scanner = new Scanner(System.in);

    public void showMenu() {
        int number = 0;
        do {
            System.out.print("Enter the number you want work: ");
            number = Integer.parseInt(scanner.nextLine());
            Menu();
            switch (number) {
                case 1:
                    addNewProduct();
            }
        } while (number != 0);

    }

    private void addNewProduct() {
        int codeProduct = getCodeProduct();
        do {
            codeProduct = getCodeProduct();
            if(serviceProduct.checkDuplicateId(codeProduct)) {
                System.out.println("Id đã tồn tại, vui lòng nhập lại");
            }
        } while (codeProduct < 0);
        System.out.print("Enter the new name product: ");
        String name = scanner.nextLine();
        System.out.print("Enter the new label: ");
        String label = scanner.nextLine();
        System.out.print("Enter the price of new product: ");
        double price = Double.parseDouble(scanner.nextLine());
        System.out.print("Enter the describe of new product: ");
        String describe = scanner.nextLine();
        Product newProduct = new Product(codeProduct, name, label, price, describe);
        serviceProduct.addProduct(newProduct);

    }

    private int getCodeProduct() {
        int codeProduct = -1;
        do {
            try {
                System.out.print("Enter the new number: ");
                codeProduct = Integer.parseInt(scanner.nextLine());
                if (codeProduct < 1) {
                    System.out.println("Id phải lớn hơn 1");
                }
            } catch (Exception e) {
                System.out.println("Id không hợp lệ, vui lòng nhập lại!!!");
            }
        } while (codeProduct < 1);
        return codeProduct;
    }

    public void Menu() {
        System.out.println("--------------------------------------");
        System.out.println("| 1. Thêm sản phẩm                    |");
        System.out.println("| 2. Hiển thị sản phẩm                |");
        System.out.println("| 3. Tìm kiếm sản phẩm                |");
        System.out.println("| 4. Xóa sản phẩm                     |");
        System.out.println("| 5. Thoát                            |");
        System.out.println("--------------------------------------");
    }
}
