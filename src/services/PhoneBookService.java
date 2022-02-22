package services;

import model.PhoneBook;
import utils.ReadOfWriteFile;

import java.util.ArrayList;

public class PhoneBookService {
    public final static String filePath = "src/data/contacts.csv";
    ArrayList<PhoneBook> phoneBookList = new ArrayList<>();

    public void writePhoneBook(ArrayList<PhoneBook> list) {
        ReadOfWriteFile.write(filePath, list);
    }

    public void addPhoneBook(PhoneBook phoneBook) {
        phoneBookList.add(phoneBook);
    }

    public ArrayList<PhoneBook> getListProduct() {
        ArrayList<PhoneBook> listProduct = new ArrayList<>();
        ArrayList<String> listRecord = ReadOfWriteFile.read(filePath);
        for (String record : listRecord) {
            listProduct.add(new PhoneBook(record));
        }
        return listProduct;
    }
}
