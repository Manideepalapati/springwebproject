package com.manideep.springwebproject;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
    @Autowired
    ProductService service;
    @PostMapping("/product")
    public void addProduct(Product p){


        service.addProduct(p);
 
    }
    @GetMapping("/products")
     public List<Product> getAllProducts(){
 
         return service.getAllProducts();
     }
     @GetMapping("/text/{item}")
     public List<Product> getProductWithText(@PathVariable String string) {
         return service.getProductWithText(string);
     }
     @GetMapping("/product/{item}")
     public Product getProduct(String string) {
         return service.getProduct(string);
     }
     @GetMapping("/place/{item}")
    public List<Product> getProductWithPlace(String string) {
         return service.getProductWithPlace(string);


        }
        @GetMapping("/outofwarranty")
        public List<Product> OutOfWarranty() {
            return service.OutOfWarranty();
        }
    
}

