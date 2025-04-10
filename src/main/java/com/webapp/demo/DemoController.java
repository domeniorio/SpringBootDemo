package com.webapp.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class DemoController {

    @Autowired
    DemoService service;

    @RequestMapping("/")
    public String HomePage() {
        return "Bgiorno a tutti belli e brutti";
    }

    @RequestMapping(path = "/products", method=RequestMethod.GET)
    public List<Product> getProducts() {
        return service.getProducts();
    }

    @RequestMapping(path="/product", method=RequestMethod.GET)
    public Product getProductById(@RequestParam int id){
        return service.getProductById(id);
    }
    
    @RequestMapping(path="/products", method=RequestMethod.POST)
    public void addProduct(@RequestBody Product product){
        service.addProduct(product);
    }
    
}
