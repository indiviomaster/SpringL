package com.geekbrains.repositories;

import com.geekbrains.entites.Product;
import org.springframework.stereotype.Component;

@Component
public class ProductsRepository {
    public Product findById(Long id){
        Product product = new Product();
        product.setId(id);
        product.setTitle("proddi");
        product.setCost(120);
        return product;
    }
}
