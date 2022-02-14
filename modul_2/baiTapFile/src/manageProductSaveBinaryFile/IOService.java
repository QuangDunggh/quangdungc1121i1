package manageProductSaveBinaryFile;

import java.util.List;

public interface IOService {
  void addProduct(Product product);
  List<Product> searchProduct(String name);
  List<Product> removeElementById(int id);
  boolean checkDuplicateId(int id);
  boolean checkDuplicateName(String name);
}
