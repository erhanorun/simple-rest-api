package com.project.simplerestapi.service;

import com.project.simplerestapi.dto.CustomerOrderDto;
import com.project.simplerestapi.entity.CustomerOrder;
import com.project.simplerestapi.entity.elastic.CustomerOrderModel;
import com.project.simplerestapi.repository.CustomerRepository;
import com.project.simplerestapi.repository.CustomerOrderRepository;
import com.project.simplerestapi.repository.elastic.CustomerOrderESRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class CustomerOrderServiceImpl implements CustomerOrderService {
    @Autowired
    private CustomerOrderRepository customerOrderRepository;
    @Autowired
    private CustomerRepository customerRepository;
    @Autowired
    private CustomerOrderESRepository customerOrderESRepository;

    public List<CustomerOrderDto> findAll() {
        return customerOrderRepository.findAll()
                .stream()
                .map(this::convertToOrderDto)
                .collect(Collectors.toList());
    }

    public CustomerOrderDto get(int order_id) {
        return customerOrderRepository.findById(order_id)
                .map(this::convertToOrderDto)
                .orElse(null);
    }

    public CustomerOrderDto add(CustomerOrderDto customerOrderDto) {
        customerOrderDto.setOrder_id(0);
        CustomerOrder order = customerOrderRepository.save(convertToOrderEntity(customerOrderDto));
        customerOrderDto.setOrder_id(order.getId());
        customerOrderESRepository.save(convertToCustomerOrderModel(customerOrderDto));
        return convertToOrderDto(order);
    }

    private CustomerOrder convertToOrderEntity(CustomerOrderDto customerOrderDto) {
        CustomerOrder order = new CustomerOrder();
        order.setId(customerOrderDto.getOrder_id());
        order.setName(customerOrderDto.getOrder_name());
        order.setPrice(customerOrderDto.getOrder_price());

        customerRepository.findById(customerOrderDto.getCustomer_id())
                .ifPresent(customer -> {
                    order.setCustomer(customer);
                    customer.getOrders().add(order);
                });
        return order;
    }

    private CustomerOrderModel convertToCustomerOrderModel(CustomerOrderDto customerOrderDto) {
        return new CustomerOrderModel(customerOrderDto.getOrder_id(), customerOrderDto.getOrder_name(), customerOrderDto.getOrder_price());
    }

    private CustomerOrderDto convertToOrderDto(CustomerOrder order) {
        CustomerOrderDto orderDto = new CustomerOrderDto();
        orderDto.setOrder_id(order.getId());
        orderDto.setOrder_name(order.getName());
        orderDto.setOrder_price(order.getPrice());

        Optional.ofNullable(order.getCustomer())
                .ifPresent(customer -> orderDto.setCustomer_id(customer.getId()));
        return orderDto;
    }


}
