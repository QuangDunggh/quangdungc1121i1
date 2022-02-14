package manageProductSaveBinaryFile;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class ServiceProduct implements IOService, Serializable {

    public List<Product> getProductList() {
         Object productList =  FileHelper.readBinaryFile("productList.csv");
         return (List<Product>) productList;
    }
    @Override
    public void addProduct(Product product) {
        List<Product> productList = getProductList();
        productList.add(product);
        FileHelper.writeBinaryFile("productList.csv",productList);
    }

    @Override
    public List<Product> searchProduct(String name) {
//        List<Product> searchProduct = new ArrayList<>();
//        for (Product product: getProductList()) {
//            if(getProductList().contains(name))
//                searchProduct.add(product);
//        }
//        return searchProduct;
        return null;
    }

    @Override
    public List<Product> removeElementById(int id) {
        return null;
    }

    @Override
    public boolean checkDuplicateId(int id) {
        List<Product> productList = getProductList();
        for (Product product: productList) {
            if(id == product.getCodeProduct()) {
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean checkDuplicateName(String name) {
        List<Product> productList = getProductList();
        for (Product product: productList) {
            if(name == product.getName()) {
                return false;
            }
        }
        return true;    }

    public Product getElementByIndex(int index) {
        return getProductList().get(index);
    }
//    public void writeToFileBinary(List<Product> productList) {
//        try{
//            OutputStream is = new FileOutputStream("product.csv");
//            ObjectOutputStream obs = new ObjectOutputStream(is);
//            for (int i = 0; i < productList.size(); i++) {
//                obs.writeObject(productList.get(i));
//            }
//            is.close();
//            obs.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }


}
