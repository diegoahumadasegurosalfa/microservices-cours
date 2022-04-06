package com.academy.dad.store.customerservice.repository;

import com.academy.dad.store.customerservice.entity.Customer;
import com.academy.dad.store.customerservice.entity.Region;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

    public Customer findByNumberId(String numberId);
    public List<Customer> findByLastName(String lastName);
    public  List<Customer> findByRegion(Region region);

}
