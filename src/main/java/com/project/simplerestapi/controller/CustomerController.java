package com.project.simplerestapi.controller;

import com.project.simplerestapi.dto.CustomerDto;
import com.project.simplerestapi.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/customers")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @GetMapping
    public List<CustomerDto> getAll() {
        return customerService.findAll();
    }

    @GetMapping(value = "/{id}")
    public CustomerDto get(@PathVariable int id) {
        return customerService.get(id);
    }

    @GetMapping(value = "/search")
    public List<CustomerDto> get(@RequestParam(value = "contains", required = false, defaultValue = "") String name,
                                 @RequestParam(value = "gt", required = false, defaultValue = "0") Integer gt,
                                 @RequestParam(value = "lt", required = false, defaultValue = "100") Integer lt,
                                 @RequestParam(value = "ncontains", required = false, defaultValue = "") String nName) {
        return customerService.search(name, lt, gt, nName);
    }

    @PostMapping
    public CustomerDto add(@RequestBody CustomerDto customerDto) {
        return customerService.add(customerDto);
    }

}
