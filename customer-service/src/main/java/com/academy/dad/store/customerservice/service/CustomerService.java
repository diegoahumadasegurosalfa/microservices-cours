package com.academy.dad.store.customerservice.service;

import com.academy.dad.store.customerservice.entity.Customer;
import com.academy.dad.store.customerservice.entity.Region;

import java.util.List;

public interface CustomerService {
    
    public List<Customer> findCustomerAll();
    public List<Customer> findCustomerByRegion(Region region);
    
    public Customer createCustomer(Customer customer);
    public Customer updateCustomer(Customer customer);
    public Customer deleteCustomer(Customer customer);
    public Customer getCustomer(Long id);

}
