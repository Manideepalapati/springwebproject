package com.manideep.springwebproject;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductDB extends JpaRepository<Product, Integer> {
    List<Product> findByNameContainingIgnoreCaseOrTypeContainingIgnoreCaseOrPlaceContainingIgnoreCase(String name, String type, String place);

    Product findByNameIgnoreCase(String name);

    List<Product> findByPlaceIgnoreCase(String place);

    List<Product> findByWarrantyLessThan(int year);

}