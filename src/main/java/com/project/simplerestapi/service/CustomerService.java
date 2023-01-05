package com.project.simplerestapi.service;

import com.project.simplerestapi.dto.CustomerDto;

import java.util.List;

public interface CustomerService {
    List<CustomerDto> findAll();

    CustomerDto get(int id);

    CustomerDto add(CustomerDto customerDto);

    List<CustomerDto> search(String searchTerm, Integer lt, Integer gt, String nName);

}
