package com.service;

import com.model.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductService implements IProductService{
    private static Map<Integer, Product> productList;

    static {
        productList = new HashMap<>();
        productList.put(1, new Product(1, "Iphone 11", "64g", 300000));
        productList.put(2, new Product(2, "iphone 8", "128g", 20000));
        productList.put(3, new Product(3, "iphone 9", "128g", 20000));
        productList.put(4, new Product(4, "iphone 10", "128g", 20000));
        productList.put(5, new Product(5, "iphone 13", "128g", 20000));
        productList.put(6, new Product(6, "iphone 7", "128g", 20000));
    }
    @Override
    public List<Product> findAll() {
        return new ArrayList<>(productList.values());
    }

    @Override
    public void save(Product product) {
        productList.put(product.getId(), product);
    }

    @Override
    public Product findById(int id) {
        return productList.get(id);
    }

    @Override
    public void update(int id, Product product) {
        productList.put(id, product);
    }

    @Override
    public void remove(int id) {
        productList.remove(id);
    }
}
