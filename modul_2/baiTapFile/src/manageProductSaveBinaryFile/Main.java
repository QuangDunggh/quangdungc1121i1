package manageProductSaveBinaryFile;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Product product1 = new Product(1,"a","i",1.0,"ádasdasd");
        Product product2 = new Product(2,"a","e",2.0,"ádasdasd");
        Product product3 = new Product(3,"a","r",3.0,"ádasdasd");
        Product product4 = new Product(4,"a","t",4.0,"ádasdasd");
        ServiceProduct serviceProduct = new ServiceProduct();
        serviceProduct.addProduct(product1);
//        serviceProduct.addProduct(product2);
//        serviceProduct.addProduct(product3);
//        serviceProduct.addProduct(product4);
        List<Product> productList = serviceProduct.getProductList();
        for (Product product: productList) {
            System.out.println(product);
        }
    }
}
