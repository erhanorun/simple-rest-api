package com.enoca.simplerestapi.controller;

import com.enoca.simplerestapi.dto.CustomerOrderDto;
import com.enoca.simplerestapi.service.CustomerOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/orders")
public class CustomerOrderController {

    @Autowired
    private CustomerOrderService customerOrderService;

    @GetMapping
    public List<CustomerOrderDto> getAll() {
        return customerOrderService.findAll();
    }

    @GetMapping(value = "/{id}")
    public CustomerOrderDto get(@PathVariable int id) {
        return customerOrderService.get(id);
    }

    @PostMapping
    public CustomerOrderDto add(@RequestBody CustomerOrderDto customerOrderDto) {
        return customerOrderService.add(customerOrderDto);
    }

}
