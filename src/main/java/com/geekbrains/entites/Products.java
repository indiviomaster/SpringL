package com.geekbrains.entites;

import java.util.List;

public class Products {

    public List<Product> getProducts() {
        products.add(new Product((long) 1,"mmm",10));
        products.add(new Product((long) 2,"mmm2",10));
        products.add(new Product((long) 3,"mmm3",10));
        products.add(new Product((long) 4,"mmm4",10));
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    private List<Product> products;

}
