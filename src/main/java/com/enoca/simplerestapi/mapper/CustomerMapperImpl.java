package com.enoca.simplerestapi.mapper;

import com.enoca.simplerestapi.dto.CustomerDto;
import com.enoca.simplerestapi.entity.Customer;
import com.enoca.simplerestapi.entity.elastic.CustomerModel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class CustomerMapperImpl implements CustomerMapper {
    Logger logger = LoggerFactory.getLogger(CustomerMapperImpl.class);

    @Override
    public CustomerDto toCustomerDto(Customer customer) {
        return null;
    }

    @Override
    public List<CustomerDto> toCustomerDtos(List<Customer> customers) {
        return null;
    }

    @Override
    public Customer toUser(CustomerDto CustomerDto) {
        return null;
    }

    @Override
    public List<Customer> toCustomers(List<CustomerDto> CustomerDtos) {
        return null;
    }

    @Override
    public CustomerModel toCustomerModel(Customer customer) {
        logger.info(customer.toString());
        return null;
    }
}
