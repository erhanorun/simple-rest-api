package com.enoca.simplerestapi.repository.elastic;

import com.enoca.simplerestapi.entity.elastic.CustomerModel;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerESRepo extends ElasticsearchRepository<CustomerModel, Integer> {
}
