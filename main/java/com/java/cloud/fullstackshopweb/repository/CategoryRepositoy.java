package com.java.cloud.fullstackshopweb.repository;

import com.java.cloud.fullstackshopweb.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoryRepositoy extends JpaRepository<Category, Integer> {
    @Query("select c from Category c where c.name like %:name%")
    List<Category> findByName(@Param("name") String name);

}
