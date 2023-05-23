package com.manideep.springwebproject;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

//import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {

    @Autowired
    ProductDB db;
   public void addProduct(Product p){


       db.save(p);

   }

    public List<Product> getAllProducts(){

        return db.findAll();
    }
    public List<Product> getProductWithText(String string) {
        return db.findByNameContainingIgnoreCaseOrTypeContainingIgnoreCaseOrPlaceContainingIgnoreCase(string, string, string);
    }

    public Product getProduct(String string) {
        return db.findByNameIgnoreCase(string);
    }

    public List<Product> getProductWithPlace(String string) {
        return db.findByPlaceIgnoreCase(string);
    }

    public List<Product> OutOfWarranty() {
        return db.findByWarrantyLessThan(2023);
    }

}