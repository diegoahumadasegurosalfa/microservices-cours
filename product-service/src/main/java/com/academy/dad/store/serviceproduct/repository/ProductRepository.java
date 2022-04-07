package com.academy.dad.store.serviceproduct.repository;

import com.academy.dad.store.serviceproduct.entity.Category;
import com.academy.dad.store.serviceproduct.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.stereotype.Repository;

import java.util.List;
//@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    public List<Product> findByCategory(Category category);
}
