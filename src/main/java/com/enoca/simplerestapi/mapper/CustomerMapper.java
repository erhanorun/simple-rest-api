package com.enoca.simplerestapi.mapper;

import com.enoca.simplerestapi.dto.CustomerDto;
import com.enoca.simplerestapi.entity.Customer;
import com.enoca.simplerestapi.entity.elastic.CustomerModel;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CustomerMapper {

    CustomerDto toCustomerDto(Customer customer);

    List<CustomerDto> toCustomerDtos(List<Customer> customers);

    Customer toUser(CustomerDto CustomerDto);

    List<Customer> toCustomers(List<CustomerDto> CustomerDtos);

    CustomerModel toCustomerModel(Customer customer);
}
