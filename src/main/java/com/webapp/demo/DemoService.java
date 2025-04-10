package com.webapp.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class DemoService {

    List<Product> products = new ArrayList<>();

    public List<Product> getProducts(){
        return products;
    }

    public Product getProductById(int id){
        return products.stream().filter(prod -> prod.getId() == id).findFirst().get();
    }

    public void addProduct(Product product){
        products.add(product);
    }
    
}
