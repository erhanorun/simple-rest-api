package com.project.simplerestapi.repository;

import com.project.simplerestapi.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer>,  JpaSpecificationExecutor<Customer> {

}
