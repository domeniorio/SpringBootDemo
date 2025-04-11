package com.webapp.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webapp.demo.repo.DemoRepository;

@Service
public class DemoService {

    @Autowired
    DemoRepository repo;

    public List<Product> getProducts(){
        return repo.findAll();
    }

    public Product getProductById(int id){
        return repo.findById(id).orElse(new Product());
    }

    public void addProduct(Product product){
        repo.save(product);
    }
    
}
