package com.project.simplerestapi.service;

import com.project.simplerestapi.dto.CustomerDto;
import com.project.simplerestapi.entity.Customer;
import com.project.simplerestapi.entity.elastic.CustomerModel;
import com.project.simplerestapi.repository.CustomerRepository;
import com.project.simplerestapi.repository.elastic.CustomerESRepo;
import org.elasticsearch.index.query.QueryBuilder;
import org.elasticsearch.index.query.QueryBuilders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.elasticsearch.core.ElasticsearchOperations;
import org.springframework.data.elasticsearch.core.SearchHit;
import org.springframework.data.elasticsearch.core.mapping.IndexCoordinates;
import org.springframework.data.elasticsearch.core.query.NativeSearchQuery;
import org.springframework.data.elasticsearch.core.query.NativeSearchQueryBuilder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private CustomerRepository customerRepository;
    @Autowired
    private CustomerESRepo customerESRepository;
    @Autowired
    private ElasticsearchOperations elasticsearchOperations;


    public List<CustomerDto> findAll() {
        return customerRepository.findAll()
                .stream()
                .map(this::convertToUserDto)
                .collect(Collectors.toList());
    }

    public CustomerDto get(int id) {
        return customerRepository.findById(id)
                .map(this::convertToUserDto)
                .orElse(null);
    }

    public CustomerDto add(CustomerDto customerDto) {
        Customer customUser = customerRepository.save(convertToCustomerEntity(customerDto));
        customerESRepository.save(convertToCustomerModel(customUser));
        return convertToUserDto(customUser);
    }

    public List<CustomerDto> search(String searchName, Integer lt, Integer gt, String nName) {
        QueryBuilder bool = QueryBuilders.wildcardQuery("customer_name", "*" + searchName + "*");
        QueryBuilder range = QueryBuilders.rangeQuery("customer_age").to(lt).from(gt);
        final NativeSearchQuery searchQuery = new NativeSearchQueryBuilder()
                .withQuery(bool)
                .withQuery(range)
                .build();
        List<SearchHit<CustomerDto>> customers = elasticsearchOperations.search(searchQuery, CustomerDto.class, IndexCoordinates.of("customer")).getSearchHits();
        return customers.stream().map(SearchHit::getContent).collect(Collectors.toList());
    }

    private CustomerDto convertToUserDto(Customer customUser) {
        CustomerDto userDto = new CustomerDto();
        userDto.setCustomer_id(customUser.getId());
        userDto.setCustomer_name(customUser.getName());
        userDto.setCustomer_age(customUser.getAge());
        return userDto;
    }

    private CustomerModel convertToCustomerModel(Customer customer) {
        return new CustomerModel(customer.getId(), customer.getName(), customer.getAge());
    }

    private Customer convertToCustomerEntity(CustomerDto customer) {
        return new Customer(customer.getCustomer_id(), customer.getCustomer_name(), customer.getCustomer_age());
    }

}
