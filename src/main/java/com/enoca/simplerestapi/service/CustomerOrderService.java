package com.enoca.simplerestapi.service;

import com.enoca.simplerestapi.dto.CustomerOrderDto;

import java.util.List;

public interface CustomerOrderService {
    List<CustomerOrderDto> findAll();

    CustomerOrderDto get(int order_id);

    CustomerOrderDto add(CustomerOrderDto customerOrderDto);

}
