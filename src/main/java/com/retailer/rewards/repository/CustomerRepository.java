package com.retailer.rewards.repository;

import com.retailer.rewards.entity.Customer;

import java.util.Optional;

@org.springframework.stereotype.Repository
public class CustomerRepository extends Repository<Customer,Long> {
    public  CustomerRepository()
    {
        Customer c1 = new Customer();
        c1.setCustomerId(1L);
        c1.setCustomerName("C1");
        add(c1);

        Customer c2 = new Customer();
        c2.setCustomerId(2L);
        c2.setCustomerName("C2");
        add(c2);

        Customer c3 = new Customer();
        c3.setCustomerId(3L);
        c3.setCustomerName("C3");
        add(c3);
    }
    @Override
    public Optional<Customer> get(Long id) {
        return list().stream().filter(k->k.getCustomerId().equals(id)).findFirst();
    }
}
