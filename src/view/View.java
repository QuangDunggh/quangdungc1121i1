package view;

import model.PhoneBook;
import services.PhoneBookService;
import services.RegularExpression;

import java.util.ArrayList;
import java.util.Scanner;

public class View {
    public void menu() {
        System.out.println("\t|--------------------------------------|");
        System.out.println("\t|                 Menu                 |");
        System.out.println("\t|--------------------------------------|");
        System.out.println("\t| 1.Xem danh sách                      |");
        System.out.println("\t| 2.Thêm mới                           |");
        System.out.println("\t| 3.Cập nhật                           |");
        System.out.println("\t| 4.Xóa                                |");
        System.out.println("\t| 5.Tìm kiếm                           |");
        System.out.println("\t| 6.Đọc từ file                        |");
        System.out.println("\t| 7.Ghi vào file                       |");
        System.out.println("\t|                         8.Thoát      |");
        System.out.println("\t|--------------------------------------|");
        System.out.println("Mời chọn chức năng:");
        System.out.print("\t➥ ");
    }

    Scanner inputs = new Scanner(System.in);
    PhoneBookService phoneBookService = new PhoneBookService();

    public void view() {
        menu();
        int choose;
        while (true) {
            while (true) {
                Scanner input = new Scanner(System.in);
                try {
                    choose = input.nextInt();
                    input.nextLine();
                    break;
                } catch (Exception e) {
                    System.out.println("\tChức năng phải là 1 số!");
                    menu();
                }
            }
            switch (choose) {
                case 1:
                    displayPhoneList();
                    view();
                    break;
                case 2:
                    addPhoneBook();
                    view();
                    break;
                case 3:
                    updatePhoneBook();
                    break;
                case 4:
                    removePhoneBook();
                    break;
                case 5:
                    search();
                    view();
                    break;
                case 6:
                    readFromFile();
                    view();
                    break;
                case 7:
                    saveToFile();
                    view();
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("\tKhông có chức năng này. Mời bạn nhập đúng chức năng!");
                    menu();
                    break;
            }
        }
    }

    ArrayList<PhoneBook> phoneBooksList = new ArrayList<>();
    public void displayPhoneList() {
        boolean check=false;
        System.out.println("Danh sách danh bạ trong bộ nhớ");
        System.out.printf("\t\t%-15s %-15s %-20s %-10s %-25s  \n", "SỐ ĐIỆN THOẠI", "NHÓM", "HỌ TÊN", "GIỚI TÍNH", "ĐỊA CHỈ");
        for (PhoneBook p : phoneBooksList) {
            check=true;
            System.out.printf("\t\t%-15s %-15s %-20s %-10s %-25s  \n", p.getPhoneNumber(), p.getGroup(), p.getFullName(), p.getSex(), p.getAddress());
        }
        if(!check){
            System.out.println("Không có danh bạ nào trong bộ nhớ");
        }
    }

    public void addPhoneBook() {
        System.out.println("Mời bạn nhập thông tin");
        String phoneNumber;
        while (true) {
            System.out.print("Nhập số điện thoại:");
            phoneNumber = inputs.nextLine();
            if (RegularExpression.isPhoneValid(phoneNumber)) {
                break;
            } else
                System.out.println("\tKhông tồn tại số điện thoại này, hãy nhập lại:");
        }
        System.out.print("Nhập nhóm danh bạ:");
        String group = inputs.nextLine();
        System.out.print("Nhập họ và tên:");
        String fullName = inputs.nextLine();
        System.out.print("Nhập giới tính:");
        String sex = inputs.nextLine();
        System.out.print("Nhập địa chỉ:");
        String address = inputs.nextLine();
        System.out.print("Nhập ngày sinh:");
        String birthDate = inputs.nextLine();
        String email;
        while (true) {
            System.out.print("Nhập email:");
            email = inputs.nextLine();
            if (RegularExpression.isEmailValid(email)) {
                break;
            } else
                System.out.println("\tKhông tồn tại địa chỉ email này, hãy nhập lại:");
        }
        PhoneBook phoneBook = new PhoneBook(phoneNumber, group, fullName, sex, address, birthDate, email);
        phoneBooksList.add(phoneBook);
        System.out.println("Đã thêm thành công danh bạ vào bộ nhớ!");
    }

    public void updatePhoneBook() {
        while (true) {
            System.out.print("Nhập số điện thoại của danh bạ cần sửa:");
            String phoneNumberNeedUpdate = inputs.nextLine();
            if (phoneNumberNeedUpdate.equals("")) {
                view();
                return;
            }
            boolean checkExistPhoneNumber = false;
            for (PhoneBook p : phoneBooksList) {
                if (p.getPhoneNumber().equals(phoneNumberNeedUpdate)) {
                    checkExistPhoneNumber = true;
                    System.out.print("Cập nhật nhóm danh bạ:");
                    String group = inputs.nextLine();
                    p.setGroup(group);
                    System.out.print("Cập nhật họ và tên:");
                    String fullName = inputs.nextLine();
                    p.setFullName(fullName);
                    System.out.print("Cập nhật giới tính:");
                    String sex = inputs.nextLine();
                    p.setSex(sex);
                    System.out.print("Cập nhật địa chỉ:");
                    String address = inputs.nextLine();
                    p.setAddress(address);
                    System.out.print("Cập nhật ngày sinh:");
                    String birthDate = inputs.nextLine();
                    p.setBirthDate(birthDate);
                    String emailUpdate;
                    while (true) {
                        System.out.print("Cập nhật email:");
                        emailUpdate = inputs.nextLine();
                        if (RegularExpression.isEmailValid(emailUpdate)) {
                            break;
                        } else
                            System.out.println("\tKhông tồn tại địa chỉ email này, hãy nhập lại:");
                    }
                    p.setEmail(emailUpdate);
                    System.out.println("Đã cập nhật thành công vào bộ nhớ");
                    break;
                }
            }
            if (checkExistPhoneNumber) {
                view();
                return;
            } else {
                System.out.println("Không tìm được danh bạ với số điện thoại trên");
            }
        }
    }

    public void removePhoneBook() {
        while (true) {
            System.out.print("Nhập số điện thoại của danh bạ cần xóa:");
            String phoneNumberNeedUpdate = inputs.nextLine();
            if (phoneNumberNeedUpdate.equals("")) {
                view();
                return;
            }
            boolean checkExistPhoneNumber = false;
            for (PhoneBook p : phoneBooksList) {
                if (p.getPhoneNumber().equals(phoneNumberNeedUpdate)) {
                    System.out.print("Nhập 'Y' để xác nhận xóa hoặc khác 'Y' để thoát:");
                    String checkOption = inputs.nextLine();
                    if (checkOption.equalsIgnoreCase("Y")) {
                        phoneBooksList.remove(p);
                        System.out.println("Đã xóa thành công ở bộ nhớ");
                        checkExistPhoneNumber = true;
                        break;
                    } else {
                        view();
                        return;
                    }
                }
            }
            if (checkExistPhoneNumber) {
                view();
                return;
            } else {
                System.out.println("Không tìm được danh bạ với số điện thoại trên");
            }
        }
    }

    public void search() {
        System.out.print("Nhập gần đúng số điện thoại hoặc họ tên:");
        String checkOption = inputs.nextLine();
        System.out.println("Danh sách danh bạ tìm kiếm");
        System.out.printf("\t\t%-15s %-15s %-20s %-10s %-25s  \n", "SỐ ĐIỆN THOẠI", "NHÓM", "HỌ TÊN", "GIỚI TÍNH", "ĐỊA CHỈ");
        boolean check =false;
        for (PhoneBook p: phoneBooksList){
            if(p.getPhoneNumber().contains(checkOption)||p.getFullName().contains(checkOption)){
                check=true;
                System.out.printf("\t\t%-15s %-15s %-20s %-10s %-25s  \n", p.getPhoneNumber(), p.getGroup(), p.getFullName(), p.getSex(), p.getAddress());
            }
        }
        if(!check){
            System.out.println("Không có danh bạ nào gần đúng!");
        }

    }

    public void saveToFile() {
        System.out.println("Nhập 'Y' để xác nhận cập nhật toàn bộ danh bạ có trong file hoặc nhập khác 'Y' để thoát");
        System.out.print("\t➥ ");
        String checkOption = inputs.nextLine();
        if (checkOption.equalsIgnoreCase("Y")) {
            phoneBookService.writePhoneBook(phoneBooksList);
            System.out.println("Đã ghi vào file thành công");
        }
    }

    public void readFromFile() {
        System.out.println("Nhập 'Y' để xác đọc danh bạ từ file hoặc nhập khác 'Y' để thoát");
        System.out.println("Nếu nhập 'Y' thì sẽ cập nhật lại toàn bộ nộ nhớ danh bạ từ file");
        System.out.print("\t➥ ");
        String checkOption = inputs.nextLine();
        if (checkOption.equalsIgnoreCase("Y")) {
            phoneBooksList = phoneBookService.getListProduct();
            System.out.println("Dữ liệu từ file đã được lưu vào bộ nhớ");
        }
    }
}
