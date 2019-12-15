package golivkin.dz_23.task_01;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MyBasket implements Basket{
    private List<Product> products;

    public MyBasket() {
        products = new ArrayList<>();
    }
    @Override
    public void addProduct(String product, int quantity) {
        this.products.add(new Product(product, quantity));
        System.out.println(product + " " + quantity);
    }

    @Override
    public void removeProduct(String product) {
    }

    @Override
    public void updateProductQuantity(String product, int quantity) {

    }
    @Override
    public void clear() {
        products.clear();

    }

    @Override
    public List<String> getProducts() {
        return null;
    }
    @Override
    public int getProductQuantity(String product){
        return 0;

    }



}
