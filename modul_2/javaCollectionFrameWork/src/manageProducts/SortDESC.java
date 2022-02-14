package manageProducts;

import java.util.Comparator;

public class SortDESC implements Comparator<Products> {
    @Override
    public int compare(Products o1, Products o2) {
        if(o1.getPrice() - o2.getPrice() < 0) {
            return 1;
        } else if(o1.getPrice() - o2.getPrice() > 0) {
            return -1;
        } else {
            return 0;
        }
    }
}
