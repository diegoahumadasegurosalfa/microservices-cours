package com.academy.dad.store.productservice.repository;

import com.academy.dad.store.productservice.entity.Category;
import com.academy.dad.store.productservice.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.stereotype.Repository;

import java.util.List;
//@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    public List<Product> findByCategory(Category category);
}
