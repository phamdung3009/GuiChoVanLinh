package com.java.cloud.fullstackshopweb.repository;

import com.java.cloud.fullstackshopweb.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepositoy extends JpaRepository<Product, Integer> {
    @Query("SELECT p FROM Product p WHERE p.name LIKE %:name%")
    List<Product> searchByName(@Param("name") String name);

}
