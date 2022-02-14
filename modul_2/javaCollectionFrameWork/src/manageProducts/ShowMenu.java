package manageProducts;

import java.util.Scanner;

public class ShowMenu {
    ManageProducts<Products> listProduct = new ManageProducts<>();
    Scanner scanner = new Scanner(System.in);
    int number = 0;

    public void ShowMenu() {
        do {
            Menu();
            System.out.print("Nhập số bạn muốn làm: ");
            number = Integer.parseInt(scanner.nextLine());
            switch (number) {
                case 1:
                    add();
            }

        } while (number != 0);
    }

    private void add() {
        Products newProduct = new Products();
        System.out.print("Nhập id sản phẩm bạn muốn thêm: ");
        int id = Integer.parseInt(scanner.nextLine());
        if(listProduct.isCheckId(id)) {
            System.out.println("Id này đã có, vui lòng nhập lại sô Id khác!!!");
            return;
        }
        System.out.print("Nhập tên sản phẩm bạn muốn thêm: ");
    }

    public void Menu() {
        System.out.println("---------------------------------------------------------");
        System.out.println("| 1. Thêm sản phẩm                                      |");
        System.out.println("| 2. Sửa thông tin sản phẩm theo ID                     |");
        System.out.println("| 3. Xóa sản phẩm theo ID                               |");
        System.out.println("| 4. Hiển thị danh sách sản phẩm                        |");
        System.out.println("| 5. Tìm kiếm sản phẩm theo tên                         |");
        System.out.println("| 6. Sắp xếp sản phẩm tăng dần theo giá                 |");
        System.out.println("| 6. Sắp xếp sản phẩm giảm dần theo giá                 |");
        System.out.println("---------------------------------------------------------");
    }
}
